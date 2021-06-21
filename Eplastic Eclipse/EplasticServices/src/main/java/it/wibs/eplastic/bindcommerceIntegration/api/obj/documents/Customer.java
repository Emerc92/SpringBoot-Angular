package it.wibs.eplastic.bindcommerceIntegration.api.obj.documents;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Customer implements Serializable {
	
	@JsonProperty("Code")
	private String code;
	
	@JsonProperty("Name")
	private String name;
	
	@JsonProperty("Surname")
	private String surname;
	
	@JsonProperty("Company")
	private String company;
	
	@JsonProperty("Address")
	private String address;
	
	@JsonProperty("Postcode")
	private String postcode;
	
	@JsonProperty("City")
	private String city;
	
	@JsonProperty("Province")
	private String province;
	
	@JsonProperty("CountryCode")
	private String countryCode;
	
	@JsonProperty("VatCode")
	private String vatCode;
	
	@JsonProperty("FiscalCode")
	private String fiscalCode;
	
	@JsonProperty("Phone")
	private String phone;
	
	@JsonProperty("MobPhone")
	private String mobPhone;
	
	@JsonProperty("Email")
	private String email;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getVatCode() {
		return vatCode;
	}

	public void setVatCode(String vatCode) {
		this.vatCode = vatCode;
	}

	public String getFiscalCode() {
		return fiscalCode;
	}

	public void setFiscalCode(String fiscalCode) {
		this.fiscalCode = fiscalCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobPhone() {
		return mobPhone;
	}

	public void setMobPhone(String mobPhone) {
		this.mobPhone = mobPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [code=");
		builder.append(code);
		builder.append(", name=");
		builder.append(name);
		builder.append(", surname=");
		builder.append(surname);
		builder.append(", company=");
		builder.append(company);
		builder.append(", address=");
		builder.append(address);
		builder.append(", postcode=");
		builder.append(postcode);
		builder.append(", city=");
		builder.append(city);
		builder.append(", province=");
		builder.append(province);
		builder.append(", countryCode=");
		builder.append(countryCode);
		builder.append(", vatCode=");
		builder.append(vatCode);
		builder.append(", fiscalCode=");
		builder.append(fiscalCode);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", mobPhone=");
		builder.append(mobPhone);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
