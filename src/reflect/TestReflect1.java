package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflect1 {

	public static void main(String[] args) {
		Class<?> obj = null;
		try {
			obj = Class.forName(Person.class.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (null != obj) {
			Constructor<?>[] constructors = null;
			constructors = obj.getConstructors();
			try {
				Method method = obj.getMethod("getName", String.class);
				try {
					Object newInstance = obj.newInstance();
					System.out.println( method.invoke(newInstance, "gxy"));
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} catch (SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (NoSuchMethodException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			for (Constructor<?> con : constructors) {
				if (con.getParameterTypes().length == 0) {
					String str1 = null;
					try {
						str1 = ((Person) obj.newInstance()).toString();
					} catch (InstantiationException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(str1);
				}
			}
		}

	}

}
