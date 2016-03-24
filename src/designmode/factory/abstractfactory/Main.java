package designmode.factory.abstractfactory;

import designmode.factory.abstractfactory.factory.TuhaoFactory;

public class Main {

	public static void main(String[] args) {
		IAbstractFactory facotry;
		String name = "shenyuanshuai";

		if ("shenyuanshuai".equals(name)) {
			facotry = new TuhaoFactory();
			System.out.println(facotry.getEat().place());
			System.out.println(facotry.getTraffic().getTrafficWay());
		}
	}

}
