package it.wibs.eplastic.bindcommerceIntegration.api.obj.documents;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Commission implements Serializable{

	@JsonProperty("PayPalCommission")
	private String payPalCommission;
	
	@JsonProperty("PayPalTransactionID")
	private String payPalTransactionID;
	
	@JsonProperty("eBayCommission")
	private String eBayCommission;

	@JsonProperty("eBayAccount")
	private String eBayAccount;
	
	@JsonProperty("eBayAdjustmentAmount")
	private String eBayAdjustmentAmount;
	
	@JsonProperty("eBayAmountSaved")
	private String eBayAmountSaved;

	public String getPayPalCommission() {
		return payPalCommission;
	}

	public void setPayPalCommission(String payPalCommission) {
		this.payPalCommission = payPalCommission;
	}

	public String getPayPalTransactionID() {
		return payPalTransactionID;
	}

	public void setPayPalTransactionID(String payPalTransactionID) {
		this.payPalTransactionID = payPalTransactionID;
	}

	public String getEbayCommission() {
		return eBayCommission;
	}

	public void setEbayCommission(String eBayCommission) {
		this.eBayCommission = eBayCommission;
	}

	public String getEbayAccount() {
		return eBayAccount;
	}

	public void setEbayAccount(String eBayAccount) {
		this.eBayAccount = eBayAccount;
	}

	public String getEbayAdjustmentAmount() {
		return eBayAdjustmentAmount;
	}

	public void setEbayAdjustmentAmount(String eBayAdjustmentAmount) {
		this.eBayAdjustmentAmount = eBayAdjustmentAmount;
	}

	public String getEbayAmountSaved() {
		return eBayAmountSaved;
	}

	public void setEbayAmountSaved(String eBayAmountSaved) {
		this.eBayAmountSaved = eBayAmountSaved;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Commission [payPalCommission=");
		builder.append(payPalCommission);
		builder.append(", payPalTransactionID=");
		builder.append(payPalTransactionID);
		builder.append(", eBayCommission=");
		builder.append(eBayCommission);
		builder.append(", eBayAccount=");
		builder.append(eBayAccount);
		builder.append(", eBayAdjustmentAmount=");
		builder.append(eBayAdjustmentAmount);
		builder.append(", eBayAmountSaved=");
		builder.append(eBayAmountSaved);
		builder.append("]");
		return builder.toString();
	}
	
	
}
