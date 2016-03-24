package reflect.method;

import java.lang.reflect.Method;

public class MethodInvoke {
	public static void main(String[] args) throws Exception {
		Msg msg = (Msg)Class.forName("reflect.method.Msg").newInstance();
		Class clazz = msg.getClass();
		Method method = clazz.getDeclaredMethod("show");
		method.invoke(msg);
	}
}
