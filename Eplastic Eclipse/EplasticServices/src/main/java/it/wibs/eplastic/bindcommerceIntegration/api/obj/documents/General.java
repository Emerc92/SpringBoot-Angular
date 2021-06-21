package it.wibs.eplastic.bindcommerceIntegration.api.obj.documents;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class General implements Serializable{

	@JsonProperty("DocumentType")
	private String documentType;
	
	@JsonProperty("bindCommerceNumber")
	private String bindCommerceNumber;
	
	@JsonProperty("Number")
	private String number;
	
	@JsonProperty("Node")
	private String node;
	
	@JsonProperty("NodeID")
	private String nodeId;
	
	@JsonProperty("Technology")
	private String technology;
	
	@JsonProperty("Market")
	private String market;
	
	@JsonProperty("Date")
	private String date;
	
	@JsonProperty("LastUpdate")
	private String lastUpdate;
	
	@JsonProperty("StatebindID")
	private String stateBindId;
	
	@JsonProperty("StateCode")
	private String stateCode;
	
	@JsonProperty("StateName")
	private String StateName;
	
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getBindCommerceNumber() {
		return bindCommerceNumber;
	}
	public void setBindCommerceNumber(String bindCommerceNumber) {
		this.bindCommerceNumber = bindCommerceNumber;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getNode() {
		return node;
	}
	public void setNode(String node) {
		this.node = node;
	}
	public String getNodeId() {
		return nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public String getStateBindId() {
		return stateBindId;
	}
	public void setStateBindId(String stateBindId) {
		this.stateBindId = stateBindId;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getStateName() {
		return StateName;
	}
	public void setStateName(String stateName) {
		StateName = stateName;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("General [documentType=");
		builder.append(documentType);
		builder.append(", bindCommerceNumber=");
		builder.append(bindCommerceNumber);
		builder.append(", number=");
		builder.append(number);
		builder.append(", node=");
		builder.append(node);
		builder.append(", nodeId=");
		builder.append(nodeId);
		builder.append(", technology=");
		builder.append(technology);
		builder.append(", market=");
		builder.append(market);
		builder.append(", date=");
		builder.append(date);
		builder.append(", lastUpdate=");
		builder.append(lastUpdate);
		builder.append(", stateBindId=");
		builder.append(stateBindId);
		builder.append(", stateCode=");
		builder.append(stateCode);
		builder.append(", StateName=");
		builder.append(StateName);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
