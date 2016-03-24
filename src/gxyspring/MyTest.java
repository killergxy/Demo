package gxyspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyTest {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"sys/myspring.xml");
		SayHelloWorld sayHello = (SayHelloWorld) context.getBean("myBean");
		sayHello.showMessage();

		Class<?> obj = null;
		try {
			obj = Class.forName("gxyspring.SayHelloWorld");
			System.out.println(obj.toString());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		if (null != obj) {
			try {
				((SayHelloWorld) obj.newInstance()).showMessage();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
	}

}
