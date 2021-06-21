package it.wibs.eplastic.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="commissions")
public class CommissionsEntity implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="COMMISSION_ID")
	private long commissionId;
	
	@Column(name="ORDER_ID")
	private String orderId;
	
	@Column(name="PAYPAL_COMMISSION")
	private String PayPalCommission;
	
	@Column(name="PAYPAL_TRANSACTION_ID")
	private String PayPalTransactionId;
	
	@Column(name="EBAY_COMMISSION")
	private String ebayCommission;
	
	@Column(name="EBAY_ACCOUNT")
	private String ebayAccount;
	
	@Column(name="EBAY_ADJUSTMENT_AMOUNT")
	private String ebayAdjustmentAmount;
	
	@Column(name="EBAY_AMOUNT_SAVED")
	private String ebayAmountSaved;

	public long getCommissionId() {
		return commissionId;
	}
	
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPayPalCommission() {
		return PayPalCommission;
	}

	public void setPayPalCommission(String PayPalCommission) {
		this.PayPalCommission = PayPalCommission;
	}

	public String getPayPalTransactionId() {
		return PayPalTransactionId;
	}

	public void setPayPalTransactionId(String PayPalTransactionId) {
		this.PayPalTransactionId = PayPalTransactionId;
	}

	public String getEbayCommission() {
		return ebayCommission;
	}

	public void setEbayCommission(String ebayCommission) {
		this.ebayCommission = ebayCommission;
	}

	public String getEbayAccount() {
		return ebayAccount;
	}

	public void setEbayAccount(String ebayAccount) {
		this.ebayAccount = ebayAccount;
	}

	public String getEbayAdjustmentAmount() {
		return ebayAdjustmentAmount;
	}

	public void setEbayAdjustmentAmount(String ebayAdjustmentAmount) {
		this.ebayAdjustmentAmount = ebayAdjustmentAmount;
	}

	public String getEbayAmountSaved() {
		return ebayAmountSaved;
	}

	public void setEbayAmountSaved(String ebayAmountSaved) {
		this.ebayAmountSaved = ebayAmountSaved;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CommissionsEntity [commissionId=");
		builder.append(commissionId);
		builder.append(", PayPalCommission=");
		builder.append(PayPalCommission);
		builder.append(", PayPalTransactionId=");
		builder.append(PayPalTransactionId);
		builder.append(", ebayCommission=");
		builder.append(ebayCommission);
		builder.append(", ebayAccount=");
		builder.append(ebayAccount);
		builder.append(", ebayAdjustmentAmount=");
		builder.append(ebayAdjustmentAmount);
		builder.append(", ebayAmountSaved=");
		builder.append(ebayAmountSaved);
		builder.append("]");
		return builder.toString();
	}
	
}