package it.eplastic.amazonintegration.api.obj.orders;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentMethodDetails implements Serializable {

	@JsonProperty("PaymentMethodDetail")
	private List<String> paymentMethodDetail;

	public List<String> getPaymentMethodDetail() {
		return paymentMethodDetail;
	}

	public void setPaymentMethodDetail(List<String> paymentMethodDetail) {
		this.paymentMethodDetail = paymentMethodDetail;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PaymentMethodDetails [paymentMethodDetail=");
		builder.append(paymentMethodDetail);
		builder.append("]");
		return builder.toString();
	}
	
}
