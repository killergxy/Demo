package vistor;

public class Test {

	public static void main(String[] args) {
		Commodity[] commodityArr = new Commodity[] { new Book(100),
				new Fruit(5, 5) };
		int totalPrice = getTotalPrice(commodityArr);
		System.out.println("Total price is:" + totalPrice);
	}

	private static int getTotalPrice(Commodity[] commodityArr) {
		int totalPrice = 0;
		VistorImpl vistor = new VistorImpl();

		for (Commodity com : commodityArr) {
			totalPrice += com.accept(vistor);
		}

		return totalPrice;
	}

}
