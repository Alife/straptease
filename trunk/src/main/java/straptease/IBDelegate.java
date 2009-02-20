package straptease;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import obc.NSObject;

public class IBDelegate extends NSObject {

	private Map<String, Field> outletMap = new HashMap<String, Field>();

	public IBDelegate() {
		Field[] fields = getClass().getDeclaredFields();
		for (Field field : fields) {
			IBOutlet outlet = (IBOutlet) field.getAnnotation(IBOutlet.class);
			if (outlet != null) {
				field.setAccessible(true);
				outletMap.put(outlet.value(), field);
			}
		}
	}


	@Override
	@joc.Message(name = "setValue:forKey:", types = "v16@0:4@8@12")
	public void setValue$forKey$(Object value, Object key) {
		Field field = outletMap.get(key.toString());
		if (field != null) {
			try {
				field.set(this, value);
			} catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			}
		} else {
			throw new RuntimeException(new NoSuchFieldException("No IBOutlet found for "+key));
		}
	}

}