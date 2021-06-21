package it.eplastic.amazonintegration.api.obj.orders;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListOrderResponse implements Serializable{

	@JsonProperty("ListOrdersResult")
	private ListOrdersResult listOrdersResult;

	public ListOrdersResult getListOrdersResult() {
		return listOrdersResult;
	}

	public void setListOrdersResult(ListOrdersResult listOrdersResult) {
		this.listOrdersResult = listOrdersResult;
	}
	
	
	
}
