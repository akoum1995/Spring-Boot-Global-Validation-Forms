package validation.example.forms.utils;

import java.util.Map;

public class ErrorResponse {
	
	  private String message;
	  private Map<String, String> details;

	  public ErrorResponse(String message, Map<String, String> details) {
	    super();
	    this.message = message;
	    this.details = details;
	  }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, String> getDetails() {
		return details;
	}

	public void setDetails(Map<String, String> details) {
		this.details = details;
	}
	  
}
