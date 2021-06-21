package it.eplastic.amazonintegration.api.obj.orders;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PointsGranted implements Serializable {
	
	@JsonProperty("PointsNumber")
	private int pointsNumber;
	@JsonProperty("PointsMonetaryValue")
	private MonetaryValue pointsMonetaryValue;
	
	public int getPointsNumber() {
		return pointsNumber;
	}
	public void setPointsNumber(int pointsNumber) {
		this.pointsNumber = pointsNumber;
	}
	public MonetaryValue getPointsMonetaryValue() {
		return pointsMonetaryValue;
	}
	public void setPointsMonetaryValue(MonetaryValue pointsMonetaryValue) {
		this.pointsMonetaryValue = pointsMonetaryValue;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PointsGranted [pointsNumber=");
		builder.append(pointsNumber);
		builder.append(", pointsMonetaryValue=");
		builder.append(pointsMonetaryValue);
		builder.append("]");
		return builder.toString();
	}
	
	
}
