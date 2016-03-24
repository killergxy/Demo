package designmode.vistor.element.impl;

import designmode.vistor.element.intef.Commodity;
import designmode.vistor.vistor.intef.IVistor;

public class Book implements Commodity {
	float orgPrice = -1;

	public Book(float orgPrice) {
		this.orgPrice = orgPrice;
	}

	@Override
	public float getPrice() {
		float price = orgPrice;
		if (orgPrice > 300) {
			price -= 100;
		}
		return price;
	}

	@Override
	public void accept(IVistor vistor) {
		vistor.vist(this);
	}
}
