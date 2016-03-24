package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class TestReflect2 {

	public static void main(String[] args) throws Exception{
		//		Class clazz = null;
		//		try {
		//			clazz = Class.forName("reflect.Person");
		//		} catch (ClassNotFoundException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}
		//		Constructor constructor =null;
		//		try {
		//			constructor = clazz.getConstructor(String.class);
		//		} catch (SecurityException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		} catch (NoSuchMethodException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}
		//		try {
		//			Person persion =(Person) constructor.newInstance("你好");
		//			System.out.println(persion.toString());
		//		} catch (IllegalArgumentException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		} catch (InstantiationException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		} catch (IllegalAccessException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		} catch (InvocationTargetException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}
		//		
		//		String path = TestReflect2.class.getClassLoader().getResource("").getPath();
		//		System.out.println(path);

		Class c = Class.forName("java.lang.Integer");
		//获取所有的属性?  
		Field[] fs = c.getDeclaredFields();

		//定义可变长的字符串，用来存储属性  
		StringBuffer sb = new StringBuffer();
		//通过追加的方法，将每个属性拼接到此字符串中  
		//最外边的public定义  
		sb.append(Modifier.toString(c.getModifiers()) + " class "
		        + c.getSimpleName() + "{\n");
		//里边的每一个属性  
		for (Field field : fs) {
			sb.append("\t");//空格  
			sb.append(Modifier.toString(field.getModifiers()) + " ");//获得属性的修饰符，例如public，static等等  
			sb.append(field.getType().getSimpleName() + " ");//属性的类型的名字  
			sb.append(field.getName() + ";\n");//属性的名字+回车  
		}

		sb.append("}");

		System.out.println(sb);
	}

}
