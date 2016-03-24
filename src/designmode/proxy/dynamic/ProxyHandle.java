package designmode.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandle implements InvocationHandler {
	Women women ;
	public ProxyHandle(Women w){
		women = w;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println(proxy.getClass().getName());
		System.out.println(method.getClass().getName());
		System.out.println("before invoke method.....");
		Object obj = method.invoke(women, args);
		System.out.println("After invoke method....");
		return obj;
	}

}
