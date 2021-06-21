package it.wibs.eplastic.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_items")
public class OrderItemEntity implements Serializable {
	
	@Id
	@Column(name = "ORDER_ITEM_CODE")
	private String itemCode;
	
	@Column(name = "ORDER_ID")
	private String orderId;
	
	@Column(name ="BIND_ID")
	private String bindId;
	
	@Column(name = "BARCODE")
	private String barcode;
	
	@Column(name = "DESCRIPTION")
	private String description;
	
	@Column(name = "QTY")
	private String qty;
	
	@Column(name = "CATEGORY")
	private String category;
	
	@Column(name = "PICTURE")
	private String picture;
	
	@Column(name = "SUPPLIER")
	private String supplier;
	
	@Column(name = "SUPPLIER_BY_REPRICING")
	private String supplierByRepricing;
	
	@Column(name = "SUPPLIER_BY_REPRICING_COST")
	private String supplierByRepricingCost;
	
	@Column(name = "SUPPLIER_PRICE")
	private String supplierPrice;
	
	@Column(name = "MPN")
	private String mpn;
	
	@Column(name = "PRICE_VAT_EXCLUDED")
	private String priceVatExcluded;
	
	@Column(name = "DISCOUNTS")
	private String discounts;
	
	@Column(name = "VAT_RATE")
	private String vatRate;
	
	@Column(name = "TOTAL_VAT_EXCLUDED")
	private String totalVatExcluded;
	
	@Column(name = "TOTAL")
	private String total;
	
	@Column(name = "TOTAL_DISCOUNTED")
	private String totalDiscount;
	
	@Column(name = "CURRENCY")
	private String currency;
	
	@Column(name = "PARAM_NAME")
	private String paramName;
	
	@Column(name = "PARAM_VALUE")
	private String paramValue;

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getBindId() {
		return bindId;
	}

	public void setBindId(String bindId) {
		this.bindId = bindId;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getQty() {
		return qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getSupplierByRepricing() {
		return supplierByRepricing;
	}

	public void setSupplierByRepricing(String supplierByRepricing) {
		this.supplierByRepricing = supplierByRepricing;
	}

	public String getSupplierByRepricingCost() {
		return supplierByRepricingCost;
	}

	public void setSupplierByRepricingCost(String supplierByRepricingCost) {
		this.supplierByRepricingCost = supplierByRepricingCost;
	}

	public String getSupplierPrice() {
		return supplierPrice;
	}
	
	public void setSupplierPrice(String supplierPrice) {
		this.supplierPrice = supplierPrice;
	}

	public String getMpn() {
		return mpn;
	}

	public void setMpn(String mpn) {
		this.mpn = mpn;
	}

	public String getPriceVatExcluded() {
		return priceVatExcluded;
	}

	public void setPriceVatExcluded(String priceVatExcluded) {
		this.priceVatExcluded = priceVatExcluded;
	}

	public String getDiscounts() {
		return discounts;
	}

	public void setDiscounts(String discounts) {
		this.discounts = discounts;
	}

	public String getVatRate() {
		return vatRate;
	}

	public void setVatRate(String vatRate) {
		this.vatRate = vatRate;
	}

	public String getTotalVatExcluded() {
		return totalVatExcluded;
	}

	public void setTotalVatExcluded(String totalVatExcluded) {
		this.totalVatExcluded = totalVatExcluded;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getTotalDiscount() {
		return totalDiscount;
	}

	public void setTotalDiscount(String totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getParamName() {
		return paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getParamValue() {
		return paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OrderItemEntity [itemCode=");
		builder.append(itemCode);
		builder.append(", orderId=");
		builder.append(orderId);
		builder.append(", bindId=");
		builder.append(bindId);
		builder.append(", barcode=");
		builder.append(barcode);
		builder.append(", description=");
		builder.append(description);
		builder.append(", qty=");
		builder.append(qty);
		builder.append(", category=");
		builder.append(category);
		builder.append(", picture=");
		builder.append(picture);
		builder.append(", supplier=");
		builder.append(supplier);
		builder.append(", supplierByRepricing=");
		builder.append(supplierByRepricing);
		builder.append(", supplierByRepricingCost=");
		builder.append(supplierByRepricingCost);
		builder.append(", supplierPrice=");
		builder.append(supplierPrice);
		builder.append(", mpn=");
		builder.append(mpn);
		builder.append(", priceVatExcluded=");
		builder.append(priceVatExcluded);
		builder.append(", discounts=");
		builder.append(discounts);
		builder.append(", vatRate=");
		builder.append(vatRate);
		builder.append(", totalVatExcluded=");
		builder.append(totalVatExcluded);
		builder.append(", total=");
		builder.append(total);
		builder.append(", totalDiscount=");
		builder.append(totalDiscount);
		builder.append(", currency=");
		builder.append(currency);
		builder.append(", paramName=");
		builder.append(paramName);
		builder.append(", paramValue=");
		builder.append(paramValue);
		builder.append("]");
		return builder.toString();
	}
}