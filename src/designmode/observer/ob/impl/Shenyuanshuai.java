package designmode.observer.ob.impl;

import designmode.observer.ob.intef.Observer;

public class Shenyuanshuai implements Observer {

	@Override
	public void update(String msg) {
		System.out.println(msg);
	}

	@Override
	public String getName() {
		return "沈袁帅";
	}


}
