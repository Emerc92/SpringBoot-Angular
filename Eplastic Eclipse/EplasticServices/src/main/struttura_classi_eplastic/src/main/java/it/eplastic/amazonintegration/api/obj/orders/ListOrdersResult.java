package it.eplastic.amazonintegration.api.obj.orders;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListOrdersResult implements Serializable{
	
	@JsonProperty("NextToken")
	private String nextToken;
	@JsonProperty("LastUpdatedBefore")
	private String lastUpdatedBefore;
	@JsonProperty("Orders")
	private List<Order> orders;
	
	public String getNextToken() {
		return nextToken;
	}
	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}
	public String getLastUpdatedBefore() {
		return lastUpdatedBefore;
	}
	public void setLastUpdatedBefore(String lastUpdatedBefore) {
		this.lastUpdatedBefore = lastUpdatedBefore;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
