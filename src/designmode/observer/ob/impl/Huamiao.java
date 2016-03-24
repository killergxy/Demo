package designmode.observer.ob.impl;

import designmode.observer.ob.intef.Observer;

public class Huamiao implements Observer {

	@Override
	public void update(String msg) {
		System.out.println(msg);
	}

	@Override
	public String getName() {
		return "华淼";
	}

}
