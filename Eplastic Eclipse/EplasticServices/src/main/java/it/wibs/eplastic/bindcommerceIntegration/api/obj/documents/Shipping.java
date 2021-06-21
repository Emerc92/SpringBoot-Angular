package it.wibs.eplastic.bindcommerceIntegration.api.obj.documents;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Shipping implements Serializable{
	
	@JsonProperty("Carrier")
	private String carrier;
	
	@JsonProperty("TrackingNumber")
	private String trackingNumber;
	
	@JsonProperty("TransportedWeight")
	private String transportedWeight;
	
	@JsonProperty("ShippedTime")
	private String shippedTime;

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public String getTransportedWeight() {
		return transportedWeight;
	}

	public void setTransportedWeight(String transportedWeight) {
		this.transportedWeight = transportedWeight;
	}

	public String getShippedTime() {
		return shippedTime;
	}

	public void setShippedTime(String shippedTime) {
		this.shippedTime = shippedTime;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Shipping [carrier=");
		builder.append(carrier);
		builder.append(", trackingNumber=");
		builder.append(trackingNumber);
		builder.append(", transportedWeight=");
		builder.append(transportedWeight);
		builder.append(", shippedTime=");
		builder.append(shippedTime);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
