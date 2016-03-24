package gxyspring;

public class SayHelloWorld {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void showMessage() {
		System.out.println("Message is:" + getMessage());
	}
}
