package designmode.vistor.vistor.intef;

import designmode.vistor.element.impl.Book;
import designmode.vistor.element.impl.Fruit;


public interface IVistor {
	public float vist(Fruit fruit);
	
	public float vist(Book book);
}
