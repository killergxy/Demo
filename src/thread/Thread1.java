package thread;

public class Thread1 extends Thread {
	private String name;
	private int count = 10;
	Thread1 t1;

	public Thread1(String name,Thread1 t1) {
		this.name = name;
		this.t1 = t1;
	}

	@Override
	public void run() {
		if(t1 != null){
			try {
	            t1.join();
            } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
            }
		}
		for (int i = 0; i < 5; i++) {
			
			StringBuilder sb = new StringBuilder();
			sb.append(name).append("运行：").append(i +1).append("次");
			
			
			System.out.println(sb.toString());
			System.out.println(name + " count: "+ count--);
			try {
	            sleep(2);
            } catch (InterruptedException e) {
	            e.printStackTrace();
            }
		}
	}
	
	public static void main(String[] args) {
	    Thread1 t1 = new Thread1("gxy",null);
	    Thread1 t2 = new Thread1("sys",t1);
	    t1.start();
	    t2.start();
    }
}
