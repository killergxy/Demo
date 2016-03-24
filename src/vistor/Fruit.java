package vistor;

public class Fruit implements Commodity {
	private int weight;
	private int price;

	public Fruit(int weight, int price) {
		this.weight = weight;
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
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
