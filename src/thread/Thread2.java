package thread;

public class Thread2 implements Runnable {
	private int count = 10;
	private String name;
	
	public Thread2(String name) {
		this.name = name;
    }
	
	@Override
    public void run() {
		for(int i = 0 ;i< 5;i++){
			StringBuilder sb = new StringBuilder();
			sb.append(Thread.currentThread().getName()).append(" count: ").append(count--);
			System.out.println(sb.toString());
		}
    }
	
	public static void main(String[] args) {
		Thread2 runnable =	new Thread2("gxy");
		Thread t1 = new Thread(runnable,"gxy");
		Thread t2 = new Thread(runnable,"sys");
		t1.start();
		t2.start();
    }

}
