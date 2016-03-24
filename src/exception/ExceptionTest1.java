package exception;

public class ExceptionTest1 {

	public void fun(String str) throws MyException{
		if(str == null){
			throw new MyException("字符串为空");
		}
	}
	public static void main(String[] args) throws MyException{
		ExceptionTest1 ex1 = new ExceptionTest1();
		ex1.fun(null);
	}
}
