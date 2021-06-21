package it.eplastic.amazonintegration.api.obj.error;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorResponse implements Serializable{

	@JsonProperty("Error")
	private Error error;
	@JsonProperty("RequestID")
	private String requestID;

	public Error getError() {
		return error;
	}

	public void setError(Error error) {
		this.error = error;
	}

	public String getRequestID() {
		return requestID;
	}

	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ErrorResponse [error=");
		builder.append(error);
		builder.append(", requestID=");
		builder.append(requestID);
		builder.append("]");
		return builder.toString();
	}
	
	
}
