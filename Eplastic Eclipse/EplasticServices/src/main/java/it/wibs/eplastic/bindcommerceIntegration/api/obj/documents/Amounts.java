package it.wibs.eplastic.bindcommerceIntegration.api.obj.documents;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Amounts implements Serializable{

	@JsonProperty("TotalWithoutTax")
	private String totalWithoutTax;
	
	@JsonProperty("VatAmount")
	private String vatAmount;
	
	@JsonProperty("Total")
	private String total;
	
	@JsonProperty("Currency")
	private String currency;
	
	@JsonProperty("ShippingCost")
	private String shippingCost;
	
	@JsonProperty("ShippingCostWithoutTax")
	private String shippingCostWithoutTax;
	
	@JsonProperty("ShippingTax")
	private String shippingTax;
	
	@JsonProperty("InternalComment")
	private String internalComment;

	@JsonProperty("SellerNote")
	private String sellerNote;

	@JsonProperty("CouponDiscount")
	private String couponDiscount;
	
	@JsonProperty("CouponCode")
	private String couponCode;
	
	@JsonProperty("DiscountToCart")
	private String DiscountToCart;

	public String getTotalWithoutTax() {
		return totalWithoutTax;
	}

	public void setTotalWithoutTax(String totalWithoutTax) {
		this.totalWithoutTax = totalWithoutTax;
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
		return shippingCostWithoutTax;
	}

	public void setShippingCostWithoutTax(String shippingCostWithoutTax) {
		this.shippingCostWithoutTax = shippingCostWithoutTax;
	}

	public String getShippingTax() {
		return shippingTax;
	}

	public void setShippingTax(String shippingTax) {
		this.shippingTax = shippingTax;
	}

	public String getInternalComment() {
		return internalComment;
	}

	public void setInternalComment(String internalComment) {
		this.internalComment = internalComment;
	}

	public String getSellerNote() {
		return sellerNote;
	}

	public void setSellerNote(String sellerNote) {
		this.sellerNote = sellerNote;
	}

	public String getCouponDiscount() {
		return couponDiscount;
	}

	public void setCouponDiscount(String couponDiscount) {
		this.couponDiscount = couponDiscount;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getDiscountToCart() {
		return DiscountToCart;
	}

	public void setDiscountToCart(String discountToCart) {
		DiscountToCart = discountToCart;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Amounts [totalWithoutTax=");
		builder.append(totalWithoutTax);
		builder.append(", vatAmount=");
		builder.append(vatAmount);
		builder.append(", total=");
		builder.append(total);
		builder.append(", currency=");
		builder.append(currency);
		builder.append(", shippingCost=");
		builder.append(shippingCost);
		builder.append(", shippingCostWithoutTax=");
		builder.append(shippingCostWithoutTax);
		builder.append(", shippingTax=");
		builder.append(shippingTax);
		builder.append(", internalComment=");
		builder.append(internalComment);
		builder.append(", sellerNote=");
		builder.append(sellerNote);
		builder.append(", couponDiscount=");
		builder.append(couponDiscount);
		builder.append(", couponCode=");
		builder.append(couponCode);
		builder.append(", DiscountToCart=");
		builder.append(DiscountToCart);
		builder.append("]");
		return builder.toString();
	}
	
}
