package it.eplastic.amazonintegration.api.obj.orders;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BuyerCustomizedInfo implements Serializable {

	@JsonProperty("CustomizedURL")
	private String customizedURL;

	public String getCustomizedURL() {
		return customizedURL;
	}

	public void setCustomizedURL(String customizedURL) {
		this.customizedURL = customizedURL;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BuyerCustomizedInfo [customizedURL=");
		builder.append(customizedURL);
		builder.append("]");
		return builder.toString();
	}
	
	
}
