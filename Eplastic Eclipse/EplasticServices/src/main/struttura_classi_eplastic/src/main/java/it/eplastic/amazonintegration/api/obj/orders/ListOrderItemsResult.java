package it.eplastic.amazonintegration.api.obj.orders;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListOrderItemsResult implements Serializable {

	@JsonProperty("NextToken")
	private String nextToken;
	@JsonProperty("AmazonOrderId")
	private String amazonOrderId;
	@JsonProperty("OrderItems")
	private List<OrderItem> orderItems;
	
	public String getNextToken() {
		return nextToken;
	}
	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}
	public String getAmazonOrderId() {
		return amazonOrderId;
	}
	public void setAmazonOrderId(String amazonOrderId) {
		this.amazonOrderId = amazonOrderId;
	}
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ListOrderItemsResult [nextToken=");
		builder.append(nextToken);
		builder.append(", amazonOrderId=");
		builder.append(amazonOrderId);
		builder.append(", orderItems=");
		builder.append(orderItems);
		builder.append("]");
		return builder.toString();
	}
	
	
}
