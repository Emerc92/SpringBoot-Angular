package it.eplastic.amazonintegration.api.obj.generic;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import it.eplastic.amazonintegration.api.obj.generic.Header;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AmazonEnvelope implements Serializable {
	
	@JsonProperty("Header")
	private Header header;
	@JsonProperty("MessageType")
	private String messageType;
	@JsonProperty("PurgeAndReplace")
	private boolean purgeAndReplace;

}
