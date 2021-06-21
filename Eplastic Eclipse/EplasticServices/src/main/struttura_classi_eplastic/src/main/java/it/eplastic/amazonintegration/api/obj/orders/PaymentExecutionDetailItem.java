package it.eplastic.amazonintegration.api.obj.orders;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentExecutionDetailItem implements Serializable {

	@JsonProperty("Payment")
	private MonetaryValue payment;
	@JsonProperty("PaymentMethod")
	private String PaymentMethod;
	
	public MonetaryValue getPayment() {
		return payment;
	}
	public void setPayment(MonetaryValue payment) {
		this.payment = payment;
	}
	public String getPaymentMethod() {
		return PaymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		PaymentMethod = paymentMethod;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PaymentExecutionDetailItem [payment=");
		builder.append(payment);
		builder.append(", PaymentMethod=");
		builder.append(PaymentMethod);
		builder.append("]");
		return builder.toString();
	}
	
	
}
