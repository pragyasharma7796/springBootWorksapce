package JWTAuthication.model;

public class JWTResponse {
	String token;

	public JWTResponse() {
		super();
	}

	public JWTResponse(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
}
