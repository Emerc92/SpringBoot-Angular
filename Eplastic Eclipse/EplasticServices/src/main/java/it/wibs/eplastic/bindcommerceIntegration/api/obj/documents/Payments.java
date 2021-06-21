package it.wibs.eplastic.bindcommerceIntegration.api.obj.documents;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Payments implements Serializable {

	@JsonProperty("PaymentName")
	private String paymentName;

	@JsonProperty("PaymentCode")
	private String paymentCode;

	@JsonProperty("PaymentTotal")
	private String paymentTotal;

	@JsonProperty("PaymentStatus")
	private String paymentStatus;

	@JsonProperty("PaidTime")
	private String paidTime;

	public String getPaymentName() {
		return paymentName;
	}

	public void setPaymentName(String paymentName) {
		this.paymentName = paymentName;
	}

	public String getPaymentCode() {
		return paymentCode;
	}

	public void setPaymentCode(String paymentCode) {
		this.paymentCode = paymentCode;
	}

	public String getPaymentTotal() {
		return paymentTotal;
	}

	public void setPaymentTotal(String paymentTotal) {
		this.paymentTotal = paymentTotal;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaidTime() {
		return paidTime;
	}

	public void setPaidTime(String paidTime) {
		this.paidTime = paidTime;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Payments [paymentName=");
		builder.append(paymentName);
		builder.append(", paymentCode=");
		builder.append(paymentCode);
		builder.append(", paymentTotal=");
		builder.append(paymentTotal);
		builder.append(", paymentStatus=");
		builder.append(paymentStatus);
		builder.append(", paidTime=");
		builder.append(paidTime);
		builder.append("]");
		return builder.toString();
	}


	
}
