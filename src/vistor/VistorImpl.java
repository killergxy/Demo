package vistor;

public class VistorImpl implements Visitor {

	@Override
	public int visit(Fruit fruit) {
		return fruit.getWeight() * fruit.getPrice();
	}

	@Override
	public int visit(Book book) {
		int price = book.getPrice();
		if (price >= 300) {
			return price - 100;
		}
		return price;
	}

}
