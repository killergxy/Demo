package messagebus;

public interface Message {
	public String READY = "ready";
	public String BUSY = "busy";

	public void setType(String type);

	public String getType();

	public void setMessage(String message);

	public String getMessage();
}
