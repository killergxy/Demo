package vistor;

public class Book implements Commodity {

	private int price;

	public Book(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
