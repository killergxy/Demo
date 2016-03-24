package staticblock;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StaticBlockTest {
	public StaticBlockTest() {
		System.out.println("构造方法");
	}

	{
		System.out.println("非静态代码块");
	}
	static {
		System.out.println("静态代码块");
	}

	public void test() {
		System.out.println("普通方法代码块");
	}

	public static void main(String[] args) {
		StaticBlockTest staticBlockTest = new StaticBlockTest();
		staticBlockTest.test();
		// List<String> list = new ArrayList<String>();
		// list.add("shenyuanshuai");
		// list.add("gengxuyang");
		// list.add("huamiao");
		// Iterator<String> iterator = list.iterator();
		// while (iterator.hasNext()) {
		// String item = iterator.next();
		// if ("shenyuanshuai".equals(item)) {
		// iterator.remove();
		// }
		// }
		// System.out.println(list.size());
		
		String path = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		
		System.out.println(path);

	}

}
