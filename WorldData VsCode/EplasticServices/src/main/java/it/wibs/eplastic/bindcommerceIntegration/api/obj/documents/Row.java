package it.wibs.eplastic.bindcommerceIntegration.api.obj.documents;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Row implements Serializable {
	
	@JacksonXmlProperty(localName = "bindID")
	private String bindId;
	
	@JacksonXmlProperty(localName ="Code")
	private String code;
	
	@JacksonXmlProperty(localName ="Barcode")
	private String barcode;
	
	@JacksonXmlProperty(localName ="Description")
	private String description;
	
	@JacksonXmlProperty(localName ="Qty")
	private String qty;
	
	@JsonProperty("ProductDimensions")
	private ProductDimensions productDimensions;
	
	@JsonProperty("ProductCategories")
	private List<Category> productCategories;
	
	@JsonProperty("Picture")
	private String picture;
	
	@JsonProperty("Supplier")
	private String supplier;
	
	@JsonProperty("SupplierByRepricing")
	private String supplierByRepricing;
	
	@JsonProperty("SupplierByRepricingCost")
	private String supplierByRepricingCost;
	
	@JsonProperty("SupplierPrice")
	private String supplierPrice;
	
	@JsonProperty("MPN")
	private String mpn;
	
	@JsonProperty("PriceVatExcluded")
	private String priceVatExcluded;
	
	@JsonProperty("Price")
	private String price;
	
	@JsonProperty("Discounts")
	private String discounts;
	
	@JsonProperty("VatRate")
	private String vatRate;
	
	@JsonProperty("TotalVatExcluded")
	private String totalVatExcluded;
	
	@JsonProperty("Total")
	private String total;
	
	@JsonProperty("TotalDiscounted")
	private String totalDiscounted;
	
	@JsonProperty("Currency")
	private String currency;
	
	@JsonProperty("Params")
	private Params params;

	public String getBindId() {
		return bindId;
	}

	public void setBindId(String bindId) {
		this.bindId = bindId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public ProductDimensions getProductDimensions() {
		return productDimensions;
	}

	public void setProductDimensions(ProductDimensions productDimensions) {
		this.productDimensions = productDimensions;
	}

	public List<Category> getProductCategories() {
		return productCategories;
	}

	public void setProductCategories(List<Category> productCategories) {
		this.productCategories = productCategories;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
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

	public String getTotalDiscounted() {
		return totalDiscounted;
	}

	public void setTotalDiscounted(String totalDiscounted) {
		this.totalDiscounted = totalDiscounted;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Params getParams() {
		return params;
	}

	public void setParams(Params params) {
		this.params = params;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Row [bindId=");
		builder.append(bindId);
		builder.append(", code=");
		builder.append(code);
		builder.append(", barcode=");
		builder.append(barcode);
		builder.append(", description=");
		builder.append(description);
		builder.append(", qty=");
		builder.append(qty);
		builder.append(", productDimensions=");
		builder.append(productDimensions);
		builder.append(", productCategories=");
		builder.append( productCategories.toString());
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
		builder.append(", price=");
		builder.append(price);
		builder.append(", discounts=");
		builder.append(discounts);
		builder.append(", vatRate=");
		builder.append(vatRate);
		builder.append(", totalVatExcluded=");
		builder.append(totalVatExcluded);
		builder.append(", total=");
		builder.append(total);
		builder.append(", totalDiscounted=");
		builder.append(totalDiscounted);
		builder.append(", currency=");
		builder.append(currency);
		builder.append(", params=");
		builder.append(params);
		builder.append("]");
		return builder.toString();
	}
	

	
}
