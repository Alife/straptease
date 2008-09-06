package straptease;


import java.lang.reflect.Field;

import joc.Boxable;
import joc.Pointer;

public class PointerSWIG {
	private static Field address;
	static {
		try {
			address=Pointer.class.getDeclaredField("address_");
			address.setAccessible(true);
		} catch (NoSuchFieldException e) {
			throw new RuntimeException(e);
		}
	}
	
	//Package private
	static long getAddress(Pointer<?> pointer) {
		if(pointer==null)
			return 0;
		try {
			Long a = (Long) address.get(pointer);
//			System.out.println(pointer+" has address: "+a);
			return a;
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

	//Package private
	static long getAddress(Boxable<?> boxable) {
		if(boxable==null)
			return 0;
		else
			return getAddress(boxable.box());
	}
}
