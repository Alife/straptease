package straptease;


import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

import joc.Boxable;
import joc.Pointer;

public class PointerSWIG {
	private static final Field pointerAddressField;
	private static final Field bufferAddressField;
	private static final Field pointer32DataField;
	private static final Field pointer64DataField;
	
	private static final Class<?> pointer32Class;
	private static final Class<?> pointer64Class;
	static {
		try {
			pointerAddressField=Pointer.class.getDeclaredField("address_");
			pointerAddressField.setAccessible(true);
			bufferAddressField=Buffer.class.getDeclaredField("address");
			bufferAddressField.setAccessible(true);
			pointer32Class=Class.forName("gnu.classpath.Pointer32");
			pointer32DataField=pointer32Class.getDeclaredField("data");
			pointer32DataField.setAccessible(true);
			pointer64Class=Class.forName("gnu.classpath.Pointer64");
			pointer64DataField=pointer64Class.getDeclaredField("data");
			pointer64DataField.setAccessible(true);
		} catch (NoSuchFieldException e) {
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
	//Package private
	static long getAddress(Pointer<?> pointer) {
		if(pointer==null)
			return 0;
		try {
			Long a = (Long) pointerAddressField.get(pointer);
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
	
	public static <T> Pointer<T> getPointer(Class<T> clazz, Buffer buffer){
		try {
			Object p=bufferAddressField.get(buffer);
			long address;
			if (pointer32Class.isAssignableFrom(p.getClass())) {
				address=((Integer)pointer32DataField.get(p)).longValue();
			} else if(pointer64Class.isAssignableFrom(p.getClass())) {
				address=((Long)pointer64DataField.get(p)).longValue();			
			} else{
				throw new IllegalArgumentException("We only support 32 and 64 bit pointers.");
			}
			return new Pointer<T>(address);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static IntBuffer createIntBuffer(int size) {
		return ByteBuffer.allocateDirect(size*4).order(ByteOrder.nativeOrder()).asIntBuffer();
	}

	public static IntBuffer wrapIntBuffer(int... data) {
		IntBuffer buffer=createIntBuffer(data.length);
		buffer.put(data).flip();
		return buffer;
	}

	public static FloatBuffer createFloatBuffer(int size) {
		return ByteBuffer.allocateDirect(size*4).order(ByteOrder.nativeOrder()).asFloatBuffer();
	}

	public static FloatBuffer wrapFloatBuffer(float... data) {
		FloatBuffer buffer=ByteBuffer.allocateDirect(data.length*4).order(ByteOrder.nativeOrder()).asFloatBuffer();
		buffer.put(data).flip();
		return buffer;
	}


}
