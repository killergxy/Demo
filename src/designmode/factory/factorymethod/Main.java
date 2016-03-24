package designmode.factory.factorymethod;

public class Main {

	public static void main(String[] args) {
		ISportShoes shoes ;
		ISportShoesFactory shoesFactory;
		
		shoesFactory = new NikeShoesFactory();
		
		shoes = shoesFactory.getShoes();
		shoes.produceShoes();
		
		shoesFactory = new AdidasShoesFactory();
		shoes = shoesFactory.getShoes();
		shoes.produceShoes();
	}

}
