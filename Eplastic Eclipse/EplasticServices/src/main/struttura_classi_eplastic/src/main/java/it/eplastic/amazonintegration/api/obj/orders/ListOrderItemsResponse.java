package it.eplastic.amazonintegration.api.obj.orders;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ListOrderItemsResponse implements Serializable {

	@JsonProperty("ListOrderItemsResult")
	private ListOrderItemsResult listOrderItemsResult;

	public ListOrderItemsResult getListOrderItemsResult() {
		return listOrderItemsResult;
	}

	public void setListOrderItemsResult(ListOrderItemsResult listOrderItemsResult) {
		this.listOrderItemsResult = listOrderItemsResult;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ListOrderItemsResponse [listOrderItemsResult=");
		builder.append(listOrderItemsResult);
		builder.append("]");
		return builder.toString();
	}
	
}
