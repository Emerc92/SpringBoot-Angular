package it.wibs.eplastic.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class OrderEntity implements Serializable {
	
	@Id
	@Column(name ="ORDER_ID")
	private String orderId;
	
	@Column(name ="BINDCOMMERCE_NUMBER")
	private String bindCommerceNumber;
	
	@Column(name ="DOCUMENT_TYPE")
	private String documentType;
	
	@Column(name ="NODE_CHANNEL")
	private String nodeChannel;

	@Column(name ="NODE_ID")
	private String nodeId;
	
	@Column(name ="TECHNOLOGY")
	private String Technology;
	
	@Column(name ="MARKET")
	private String market;
	
	@Column(name ="CREATION_DATE")
	private String creationDate;
	
	@Column(name ="LAST_UPDATE")
	private String lastUpdate;
	
	@Column(name ="STATE_BIND_ID")
	private String stateBindId;
	
	@Column(name ="ORDER_STATE_CODE")
	private String orderStateCode;
	
	@Column(name ="ORDER_STATE_NAME")
	private String orderStateName;
	
	@Column(name ="CUSTOMER_CODE")
	private String customerCode;
	
	@Column(name ="DELIVERY_ADDRESS")
	private String deliveryAddress;
	
	@Column(name ="PAYMENT_NAME")
	private String paymentName;
	
	@Column(name ="PAYMENT_CODE")
	private String paymentCode;
	
	@Column(name ="PAYMENT_TOTAL")
	private String paymentTotal;
	
	@Column(name ="PAYMENT_STATUS")
	private String paymentStatus;
	
	@Column(name ="PAID_TIME")
	private String paidTime;
	
	@Column(name ="AMOUNT_TOTAL_WITHOUT_TAX")
	private String amount_totalWithoutTax;
	
	@Column(name ="VAT_AMOUNT")
	private String vatAmount;
	
	@Column(name ="TOTAL")
	private String total;

	@Column(name ="CURRENCY")
	private String currency;
	
	@Column(name ="SHIPPING_COST")
	private String shippingCost;
	
	@Column(name = "SHIPPING_COST_WITHOUT_TAX")
	private String ShippingCostWithoutTax;
	
	@Column(name ="SHIPPING_TAX")
	private String shippingTax;
	
	@Column(name ="INTERNAL_COMMENT")
	private String InternalComment;
	
	@Column(name ="SELLER_NOTE")
	private String sellerNote;
	
	@Column(name ="COUPON_DISCOUNT")
	private String CouponDiscount;
	
	@Column(name ="COUPON_CODE")
	private String couponCode;
	
	@Column(name ="DISCOUNT_TO_CART")
	private String discountToCart;
	
	@Column(name ="TRACKING_NUMBER")
	private String TrackingNumber;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getBindCommerceNumber() {
		return bindCommerceNumber;
	}

	public void setBindCommerceNumber(String bindCommerceNumber) {
		this.bindCommerceNumber = bindCommerceNumber;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getNodeChannel() {
		return nodeChannel;
	}

	public void setNodeChannel(String node_channel) {
		this.nodeChannel = node_channel;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getTechnology() {
		return Technology;
	}

	public void setTechnology(String technology) {
		Technology = technology;
	}

	public String getMarket() {
		return market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
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

	public String getOrderStateCode() {
		return orderStateCode;
	}

	public void setOrderStateCode(String orderStateCode) {
		this.orderStateCode = orderStateCode;
	}

	public String getOrderStateName() {
		return orderStateName;
	}

	public void setOrderStateName(String orderStateName) {
		this.orderStateName = orderStateName;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

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

	public String getAmount_totalWithoutTax() {
		return amount_totalWithoutTax;
	}

	public void setAmount_totalWithoutTax(String amount_totalWithoutTax) {
		this.amount_totalWithoutTax = amount_totalWithoutTax;
	}

	public String getVatAmount() {
		return vatAmount;
	}

	public void setVatAmount(String vatAmount) {
		this.vatAmount = vatAmount;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getShippingCost() {
		return shippingCost;
	}

	public void setShippingCost(String shippingCost) {
		this.shippingCost = shippingCost;
	}

	public String getShippingCostWithoutTax() {
		return ShippingCostWithoutTax;
	}

	public void setShippingCostWithoutTax(String shippingCostWithoutTax) {
		ShippingCostWithoutTax = shippingCostWithoutTax;
	}

	public String getShippingTax() {
		return shippingTax;
	}

	public void setShippingTax(String shippingTax) {
		this.shippingTax = shippingTax;
	}

	public String getInternalComment() {
		return InternalComment;
	}

	public void setInternalComment(String internalComment) {
		InternalComment = internalComment;
	}

	public String getSellerNote() {
		return sellerNote;
	}

	public void setSellerNote(String sellerNote) {
		this.sellerNote = sellerNote;
	}

	public String getCouponDiscount() {
		return CouponDiscount;
	}

	public void setCouponDiscount(String couponDiscount) {
		CouponDiscount = couponDiscount;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getDiscountToCart() {
		return discountToCart;
	}

	public void setDiscountToCart(String discountToCart) {
		this.discountToCart = discountToCart;
	}

	public String getTrackingNumber() {
		return TrackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		TrackingNumber = trackingNumber;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderEntity [orderId=");
		builder.append(orderId);
		builder.append(", bindCommerceNumber=");
		builder.append(bindCommerceNumber);
		builder.append(", documentType=");
		builder.append(documentType);
		builder.append(", nodeChannel=");
		builder.append(nodeChannel);
		builder.append(", nodeId=");
		builder.append(nodeId);
		builder.append(", Technology=");
		builder.append(Technology);
		builder.append(", market=");
		builder.append(market);
		builder.append(", creationDate=");
		builder.append(creationDate);
		builder.append(", lastUpdate=");
		builder.append(lastUpdate);
		builder.append(", stateBindId=");
		builder.append(stateBindId);
		builder.append(", orderStateCode=");
		builder.append(orderStateCode);
		builder.append(", orderStateName=");
		builder.append(orderStateName);
		builder.append(", customerCode=");
		builder.append(customerCode);
		builder.append(", deliveryAddress=");
		builder.append(deliveryAddress);
		builder.append(", paymentName=");
		builder.append(paymentName);
		builder.append(", paymentCode=");
		builder.append(paymentCode);
		builder.append(", paymentTotal=");
		builder.append(paymentTotal);
		builder.append(", paymentStatus=");
		builder.append(paymentStatus);
		builder.append(", paidTime=");
		builder.append(paidTime);
		builder.append(", amount_totalWithoutTax=");
		builder.append(amount_totalWithoutTax);
		builder.append(", vatAmount=");
		builder.append(vatAmount);
		builder.append(", total=");
		builder.append(total);
		builder.append(", currency=");
		builder.append(currency);
		builder.append(", shippingCost=");
		builder.append(shippingCost);
		builder.append(", ShippingCostWithoutTax=");
		builder.append(ShippingCostWithoutTax);
		builder.append(", shippingTax=");
		builder.append(shippingTax);
		builder.append(", InternalComment=");
		builder.append(InternalComment);
		builder.append(", sellerNote=");
		builder.append(sellerNote);
		builder.append(", CouponDiscount=");
		builder.append(CouponDiscount);
		builder.append(", couponCode=");
		builder.append(couponCode);
		builder.append(", discountToCart=");
		builder.append(discountToCart);
		builder.append(", TrackingNumber=");
		builder.append(TrackingNumber);
		builder.append("]");
		return builder.toString();
	}
}