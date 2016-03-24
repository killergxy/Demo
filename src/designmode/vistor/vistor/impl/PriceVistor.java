package designmode.vistor.vistor.impl;

import designmode.vistor.element.impl.Book;
import designmode.vistor.element.impl.Fruit;
import designmode.vistor.vistor.intef.IVistor;

public class PriceVistor implements IVistor {

	@Override
	public float vist(Fruit fruit) {
		return fruit.getPrice();

	}

	@Override
	public float vist(Book book) {
		return book.getPrice();
	}

}
