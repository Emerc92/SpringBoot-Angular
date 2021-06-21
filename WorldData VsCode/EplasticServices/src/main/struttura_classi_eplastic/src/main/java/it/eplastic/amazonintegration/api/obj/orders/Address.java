package it.eplastic.amazonintegration.api.obj.orders;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Address implements Serializable {
	@JsonProperty("Name")
	private String name;
	@JsonProperty("AddressLine1")
	private String addressLine1;
	@JsonProperty("AddressLine2")
	private String addressLine2;
	@JsonProperty("City")
	private String city;
	@JsonProperty("StateOrRegion")
	private String stateOrRegion;
	@JsonProperty("PostalCode")
	private String postalCode;
	@JsonProperty("CountryCode")
	private String countryCode;
	@JsonProperty("AddressType")
	private String addressType;
	@JsonProperty("Phone")
	private String phone;
	@JsonProperty("isAddressSharingConfidential")
	private boolean addressSharingConfidential;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStateOrRegion() {
		return stateOrRegion;
	}
	public void setStateOrRegion(String stateOrRegion) {
		this.stateOrRegion = stateOrRegion;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isAddressSharingConfidential() {
		return addressSharingConfidential;
	}
	public void setAddressSharingConfidential(boolean addressSharingConfidential) {
		this.addressSharingConfidential = addressSharingConfidential;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [name=");
		builder.append(name);
		builder.append(", addressLine1=");
		builder.append(addressLine1);
		builder.append(", addressLine2=");
		builder.append(addressLine2);
		builder.append(", city=");
		builder.append(city);
		builder.append(", stateOrRegion=");
		builder.append(stateOrRegion);
		builder.append(", postalCode=");
		builder.append(postalCode);
		builder.append(", countryCode=");
		builder.append(countryCode);
		builder.append(", addressType=");
		builder.append(addressType);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", addressSharingConfidential=");
		builder.append(addressSharingConfidential);
		builder.append("]");
		return builder.toString();
	}
	
	
}
