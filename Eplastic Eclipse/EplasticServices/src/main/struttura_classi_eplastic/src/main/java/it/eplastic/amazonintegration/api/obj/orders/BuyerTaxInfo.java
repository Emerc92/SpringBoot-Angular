package it.eplastic.amazonintegration.api.obj.orders;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BuyerTaxInfo implements Serializable{

	@JsonProperty("CompanyLegalName")
	private String companyLegalName;
	@JsonProperty("TaxingRegion")
	private String taxingRegion;
	@JsonProperty("TaxClassifications")
	private List<TaxClassification> taxClassifications;
	public String getCompanyLegalName() {
		return companyLegalName;
	}
	public void setCompanyLegalName(String companyLegalName) {
		this.companyLegalName = companyLegalName;
	}
	public String getTaxingRegion() {
		return taxingRegion;
	}
	public void setTaxingRegion(String taxingRegion) {
		this.taxingRegion = taxingRegion;
	}
	public List<TaxClassification> getTaxClassifications() {
		return taxClassifications;
	}
	public void setTaxClassifications(List<TaxClassification> taxClassifications) {
		this.taxClassifications = taxClassifications;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BuyerTaxInfo [companyLegalName=");
		builder.append(companyLegalName);
		builder.append(", taxingRegion=");
		builder.append(taxingRegion);
		builder.append(", taxClassifications=");
		builder.append(taxClassifications);
		builder.append("]");
		return builder.toString();
	}
	
	
}
