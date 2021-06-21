package it.eplastic.amazonintegration.api.obj.generic;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Message implements Serializable {
	
	@JsonProperty("MessageID")
	private long messageID;
	@JsonProperty("OperationType")
	private String operationType;
	
	public long getMessageID() {
		return messageID;
	}
	public void setMessageID(long messageID) {
		this.messageID = messageID;
	}
	public String getOperationType() {
		return operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Message [messageID=");
		builder.append(messageID);
		builder.append(", operationType=");
		builder.append(operationType);
		builder.append("]");
		return builder.toString();
	}
	
	
}
