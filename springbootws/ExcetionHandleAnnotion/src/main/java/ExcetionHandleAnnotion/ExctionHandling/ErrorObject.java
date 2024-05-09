package ExcetionHandleAnnotion.ExctionHandling;

public class ErrorObject {
	private int StatusCode;
	private String message;
	private long timeStamp;
	public ErrorObject(int statusCode, String message, long timeStamp) {
		super();
		StatusCode = statusCode;
		this.message = message;
		this.timeStamp = timeStamp;
	}
	public int getStatusCode() {
		return StatusCode;
	}
	public void setStatusCode(int statusCode) {
		StatusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
}
