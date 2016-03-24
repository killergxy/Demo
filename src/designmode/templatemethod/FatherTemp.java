package designmode.templatemethod;

public abstract class FatherTemp {
	public void before(){
		System.out.println("before comes.....");
	}
	
	public abstract void now();
	
	public void after(){
		System.out.println("after comes.....");
	}
}
