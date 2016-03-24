package designmode.vistor.element.impl;

import designmode.vistor.element.intef.Commodity;
import designmode.vistor.vistor.intef.IVistor;

public class Fruit implements Commodity {

	@Override
	public float getPrice() {
		return 0;
	}

	@Override
	public void accept(IVistor vistor) {
		vistor.vist(this);
	}
}
