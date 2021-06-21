package it.eplastic.amazonintegration.api.obj.orders;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Order implements Serializable {

	@JsonProperty("AmazonOrderId")
	private String amazonOrderId;
	@JsonProperty("PurchaseDate")
	private String purchaseDate;
	@JsonProperty("LastUpdateDate")
	private String lastUpdateDate;
	@JsonProperty("OrderStatus")
	private String orderStatus;
	@JsonProperty("FulfillmentChannel")
	private String fulfillmentChannel;
	@JsonProperty("ShipServiceLevel")
	private String shipServiceLevel;
	@JsonProperty("SalesChannel")
	private String salesChannel;
	@JsonProperty("ShippingAddress")
	private Address shippingAddress;
	@JsonProperty("DefaultShipFromLocationAddress")
	private Address defaultShipFromLocationAddress;
	@JsonProperty("OrderTotal")
	private OrderTotal orderTotal;
	@JsonProperty("NumberOfItemsShipped")
	private int numberOfItemsShipped;
	@JsonProperty("NumberOfItemsUnshipped")
	private int numberOfItemsUnshipped;
	@JsonProperty("PaymentExecutionDetail")
	private List<PaymentExecutionDetailItem> paymentExecutionDetail;
	@JsonProperty("PaymentMethod")
	private String paymentMethod;
	@JsonProperty("PaymentMethodDetails")
	private PaymentMethodDetails paymentMethodDetails;
	@JsonProperty("MarketplaceId")
	private String marketplaceId;
	@JsonProperty("BuyerEmail")
	private String buyerEmail;
	@JsonProperty("BuyerName")
	private String buyerName;
	@JsonProperty("BuyerTaxInfo")
	private String buyerTaxInfo;
	@JsonProperty("OrderType")
	private String orderType;
	@JsonProperty("EarliestShipDate")
	private String earliestShipDate;
	@JsonProperty("LatestShipDate")
	private String latestShipDate;
	@JsonProperty("IsBusinessOrder")
	private boolean businessOrder;
	@JsonProperty("PurchaseOrderNumber")
	private String purchaseOrderNumber;
	@JsonProperty("IsPrime")
	private boolean prime;
	@JsonProperty("IsPremiumOrder")
	private String premiumOrder;
	@JsonProperty("IsGlobalExpressEnabled")
	private String globalExpressEnabled;
	public String getAmazonOrderId() {
		return amazonOrderId;
	}
	public void setAmazonOrderId(String amazonOrderId) {
		this.amazonOrderId = amazonOrderId;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public String getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getFulfillmentChannel() {
		return fulfillmentChannel;
	}
	public void setFulfillmentChannel(String fulfillmentChannel) {
		this.fulfillmentChannel = fulfillmentChannel;
	}
	public String getShipServiceLevel() {
		return shipServiceLevel;
	}
	public void setShipServiceLevel(String shipServiceLevel) {
		this.shipServiceLevel = shipServiceLevel;
	}
	public String getSalesChannel() {
		return salesChannel;
	}
	public void setSalesChannel(String salesChannel) {
		this.salesChannel = salesChannel;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public Address getDefaultShipFromLocationAddress() {
		return defaultShipFromLocationAddress;
	}
	public void setDefaultShipFromLocationAddress(Address defaultShipFromLocationAddress) {
		this.defaultShipFromLocationAddress = defaultShipFromLocationAddress;
	}
	public OrderTotal getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(OrderTotal orderTotal) {
		this.orderTotal = orderTotal;
	}
	public int getNumberOfItemsShipped() {
		return numberOfItemsShipped;
	}
	public void setNumberOfItemsShipped(int numberOfItemsShipped) {
		this.numberOfItemsShipped = numberOfItemsShipped;
	}
	public int getNumberOfItemsUnshipped() {
		return numberOfItemsUnshipped;
	}
	public void setNumberOfItemsUnshipped(int numberOfItemsUnshipped) {
		this.numberOfItemsUnshipped = numberOfItemsUnshipped;
	}
	public List<PaymentExecutionDetailItem> getPaymentExecutionDetail() {
		return paymentExecutionDetail;
	}
	public void setPaymentExecutionDetail(List<PaymentExecutionDetailItem> paymentExecutionDetail) {
		this.paymentExecutionDetail = paymentExecutionDetail;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public PaymentMethodDetails getPaymentMethodDetails() {
		return paymentMethodDetails;
	}
	public void setPaymentMethodDetails(PaymentMethodDetails paymentMethodDetails) {
		this.paymentMethodDetails = paymentMethodDetails;
	}
	public String getMarketplaceId() {
		return marketplaceId;
	}
	public void setMarketplaceId(String marketplaceId) {
		this.marketplaceId = marketplaceId;
	}
	public String getBuyerEmail() {
		return buyerEmail;
	}
	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getBuyerTaxInfo() {
		return buyerTaxInfo;
	}
	public void setBuyerTaxInfo(String buyerTaxInfo) {
		this.buyerTaxInfo = buyerTaxInfo;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getEarliestShipDate() {
		return earliestShipDate;
	}
	public void setEarliestShipDate(String earliestShipDate) {
		this.earliestShipDate = earliestShipDate;
	}
	public String getLatestShipDate() {
		return latestShipDate;
	}
	public void setLatestShipDate(String latestShipDate) {
		this.latestShipDate = latestShipDate;
	}
	public boolean isBusinessOrder() {
		return businessOrder;
	}
	public void setBusinessOrder(boolean businessOrder) {
		this.businessOrder = businessOrder;
	}
	public String getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}
	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}
	public boolean isPrime() {
		return prime;
	}
	public void setPrime(boolean prime) {
		this.prime = prime;
	}
	public String getPremiumOrder() {
		return premiumOrder;
	}
	public void setPremiumOrder(String premiumOrder) {
		this.premiumOrder = premiumOrder;
	}
	public String getGlobalExpressEnabled() {
		return globalExpressEnabled;
	}
	public void setGlobalExpressEnabled(String globalExpressEnabled) {
		this.globalExpressEnabled = globalExpressEnabled;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order [amazonOrderId=");
		builder.append(amazonOrderId);
		builder.append(", purchaseDate=");
		builder.append(purchaseDate);
		builder.append(", lastUpdateDate=");
		builder.append(lastUpdateDate);
		builder.append(", orderStatus=");
		builder.append(orderStatus);
		builder.append(", fulfillmentChannel=");
		builder.append(fulfillmentChannel);
		builder.append(", shipServiceLevel=");
		builder.append(shipServiceLevel);
		builder.append(", salesChannel=");
		builder.append(salesChannel);
		builder.append(", shippingAddress=");
		builder.append(shippingAddress);
		builder.append(", defaultShipFromLocationAddress=");
		builder.append(defaultShipFromLocationAddress);
		builder.append(", orderTotal=");
		builder.append(orderTotal);
		builder.append(", numberOfItemsShipped=");
		builder.append(numberOfItemsShipped);
		builder.append(", numberOfItemsUnshipped=");
		builder.append(numberOfItemsUnshipped);
		builder.append(", paymentExecutionDetail=");
		builder.append(paymentExecutionDetail);
		builder.append(", paymentMethod=");
		builder.append(paymentMethod);
		builder.append(", paymentMethodDetails=");
		builder.append(paymentMethodDetails);
		builder.append(", marketplaceId=");
		builder.append(marketplaceId);
		builder.append(", buyerEmail=");
		builder.append(buyerEmail);
		builder.append(", buyerName=");
		builder.append(buyerName);
		builder.append(", buyerTaxInfo=");
		builder.append(buyerTaxInfo);
		builder.append(", orderType=");
		builder.append(orderType);
		builder.append(", earliestShipDate=");
		builder.append(earliestShipDate);
		builder.append(", latestShipDate=");
		builder.append(latestShipDate);
		builder.append(", businessOrder=");
		builder.append(businessOrder);
		builder.append(", purchaseOrderNumber=");
		builder.append(purchaseOrderNumber);
		builder.append(", prime=");
		builder.append(prime);
		builder.append(", premiumOrder=");
		builder.append(premiumOrder);
		builder.append(", globalExpressEnabled=");
		builder.append(globalExpressEnabled);
		builder.append("]");
		return builder.toString();
	}
	
	

}