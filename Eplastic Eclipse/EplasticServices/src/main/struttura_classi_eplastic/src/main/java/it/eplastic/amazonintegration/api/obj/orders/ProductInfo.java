package it.eplastic.amazonintegration.api.obj.orders;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductInfo implements Serializable {

	@JsonProperty("NumberOfItems")
	private String numberOfItems;

	public String getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(String numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductInfo [numberOfItems=");
		builder.append(numberOfItems);
		builder.append("]");
		return builder.toString();
	}
	
	
}
