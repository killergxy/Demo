package designmode.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Shenyuanshuai {

	public static void main(String[] args) {
		Women panjianlian = new Panjinlian();
		InvocationHandler handler = new ProxyHandle(panjianlian);
		
		Women proxyWomen = (Women)Proxy.newProxyInstance(panjianlian.getClass().getClassLoader(), panjianlian.getClass().getInterfaces() , handler);
		
		proxyWomen.maskEyes();
		
		proxyWomen.happyWithMan();
	}

}
