package it.eplastic.amazonintegration.api.obj.orders;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderItem implements Serializable {
	
	@JsonProperty("ASIN")
	private String asin;
	@JsonProperty("OrderItemId")
	private String orderItemId;
	@JsonProperty("BuyerCustomizedInfo")
	private BuyerCustomizedInfo buyerCustomizedInfo;
	@JsonProperty("SellerSKU")
	private String sellerSKU;
	@JsonProperty("Title")
	private String title;
	@JsonProperty("QuantityOrdered")
	private int quantityOrdered;
	@JsonProperty("QuantityShipped")
	private int quantityShipped;
	@JsonProperty("ProductInfo")
	private ProductInfo productInfo;
	@JsonProperty("PointsGranted")
	private PointsGranted pointsGranted;
	@JsonProperty("ItemPrice")
	private MonetaryValue itemPrice;
	@JsonProperty("ShippingPrice")
	private MonetaryValue shippingPrice;
	@JsonProperty("ScheduledDeliveryEndDate")
	private String scheduledDeliveryEndDate;
	@JsonProperty("ScheduledDeliveryStartDate")
	private String scheduledDeliveryStartDate;
	@JsonProperty("CODFee")
	private MonetaryValue codFee;
	@JsonProperty("CODFeeDiscount")
	private MonetaryValue codFeeDiscount;
	@JsonProperty("IsGift")
	private boolean gift;
	@JsonProperty("IsTransparency")
	private boolean transparency;
	@JsonProperty("GiftMessageText")
	private String giftMessageText;
	@JsonProperty("GiftWrapPrice")
	private MonetaryValue giftWrapPrice;
	@JsonProperty("GiftWrapLevel")
	private String giftWrapLevel;
	@JsonProperty("PriceDesignation")
	private String priceDesignation;
	public String getAsin() {
		return asin;
	}
	public void setAsin(String asin) {
		this.asin = asin;
	}
	public String getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}
	public BuyerCustomizedInfo getBuyerCustomizedInfo() {
		return buyerCustomizedInfo;
	}
	public void setBuyerCustomizedInfo(BuyerCustomizedInfo buyerCustomizedInfo) {
		this.buyerCustomizedInfo = buyerCustomizedInfo;
	}
	public String getSellerSKU() {
		return sellerSKU;
	}
	public void setSellerSKU(String sellerSKU) {
		this.sellerSKU = sellerSKU;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getQuantityOrdered() {
		return quantityOrdered;
	}
	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}
	public int getQuantityShipped() {
		return quantityShipped;
	}
	public void setQuantityShipped(int quantityShipped) {
		this.quantityShipped = quantityShipped;
	}
	public ProductInfo getProductInfo() {
		return productInfo;
	}
	public void setProductInfo(ProductInfo productInfo) {
		this.productInfo = productInfo;
	}
	public PointsGranted getPointsGranted() {
		return pointsGranted;
	}
	public void setPointsGranted(PointsGranted pointsGranted) {
		this.pointsGranted = pointsGranted;
	}
	public MonetaryValue getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(MonetaryValue itemPrice) {
		this.itemPrice = itemPrice;
	}
	public MonetaryValue getShippingPrice() {
		return shippingPrice;
	}
	public void setShippingPrice(MonetaryValue shippingPrice) {
		this.shippingPrice = shippingPrice;
	}
	public String getScheduledDeliveryEndDate() {
		return scheduledDeliveryEndDate;
	}
	public void setScheduledDeliveryEndDate(String scheduledDeliveryEndDate) {
		this.scheduledDeliveryEndDate = scheduledDeliveryEndDate;
	}
	public String getScheduledDeliveryStartDate() {
		return scheduledDeliveryStartDate;
	}
	public void setScheduledDeliveryStartDate(String scheduledDeliveryStartDate) {
		this.scheduledDeliveryStartDate = scheduledDeliveryStartDate;
	}
	public MonetaryValue getCodFee() {
		return codFee;
	}
	public void setCodFee(MonetaryValue codFee) {
		this.codFee = codFee;
	}
	public MonetaryValue getCodFeeDiscount() {
		return codFeeDiscount;
	}
	public void setCodFeeDiscount(MonetaryValue codFeeDiscount) {
		this.codFeeDiscount = codFeeDiscount;
	}
	public boolean isGift() {
		return gift;
	}
	public void setGift(boolean gift) {
		this.gift = gift;
	}
	public boolean isTransparency() {
		return transparency;
	}
	public void setTransparency(boolean transparency) {
		this.transparency = transparency;
	}
	public String getGiftMessageText() {
		return giftMessageText;
	}
	public void setGiftMessageText(String giftMessageText) {
		this.giftMessageText = giftMessageText;
	}
	public MonetaryValue getGiftWrapPrice() {
		return giftWrapPrice;
	}
	public void setGiftWrapPrice(MonetaryValue giftWrapPrice) {
		this.giftWrapPrice = giftWrapPrice;
	}
	public String getGiftWrapLevel() {
		return giftWrapLevel;
	}
	public void setGiftWrapLevel(String giftWrapLevel) {
		this.giftWrapLevel = giftWrapLevel;
	}
	public String getPriceDesignation() {
		return priceDesignation;
	}
	public void setPriceDesignation(String priceDesignation) {
		this.priceDesignation = priceDesignation;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderItem [asin=");
		builder.append(asin);
		builder.append(", orderItemId=");
		builder.append(orderItemId);
		builder.append(", buyerCustomizedInfo=");
		builder.append(buyerCustomizedInfo);
		builder.append(", sellerSKU=");
		builder.append(sellerSKU);
		builder.append(", title=");
		builder.append(title);
		builder.append(", quantityOrdered=");
		builder.append(quantityOrdered);
		builder.append(", quantityShipped=");
		builder.append(quantityShipped);
		builder.append(", productInfo=");
		builder.append(productInfo);
		builder.append(", pointsGranted=");
		builder.append(pointsGranted);
		builder.append(", itemPrice=");
		builder.append(itemPrice);
		builder.append(", shippingPrice=");
		builder.append(shippingPrice);
		builder.append(", scheduledDeliveryEndDate=");
		builder.append(scheduledDeliveryEndDate);
		builder.append(", scheduledDeliveryStartDate=");
		builder.append(scheduledDeliveryStartDate);
		builder.append(", codFee=");
		builder.append(codFee);
		builder.append(", codFeeDiscount=");
		builder.append(codFeeDiscount);
		builder.append(", gift=");
		builder.append(gift);
		builder.append(", transparency=");
		builder.append(transparency);
		builder.append(", giftMessageText=");
		builder.append(giftMessageText);
		builder.append(", giftWrapPrice=");
		builder.append(giftWrapPrice);
		builder.append(", giftWrapLevel=");
		builder.append(giftWrapLevel);
		builder.append(", priceDesignation=");
		builder.append(priceDesignation);
		builder.append("]");
		return builder.toString();
	}
	
}
