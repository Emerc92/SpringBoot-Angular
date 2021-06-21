package it.wibs.eplastic.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="customer")
public class CustomerEntity {

	@Id
	@Column(name ="CUSTOMER_CODE")
	private String customerCode;
	
	@Column(name ="NAME")
	private String name;
	
	@Column(name ="SURNAME")
	private String surname;
	
	@Column(name ="ADDRESS")
	private String address;
	
	@Column(name ="POSTCODE")
	private String postcode;

	@Column(name ="CITY")
	private String city;
	
	@Column(name ="PROVINCE")
	private String province;
	
	@Column(name ="COUNTRY_CODE")
	private String countryCode;
	
	@Column(name ="VAT_CODE")
	private String vatCode;
	
	@Column(name ="FISCAL_CODE")
	private String fiscalCode;
	
	@Column(name ="PHONE")
	private String phone;
	
	@Column(name ="MOB_PHONE")
	private String mobPhone;
	
	@Column(name ="EMAIL")
	private String email;

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
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
		builder.append("CustomerEntity [customerCode=");
		builder.append(customerCode);
		builder.append(", name=");
		builder.append(name);
		builder.append(", surname=");
		builder.append(surname);
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
