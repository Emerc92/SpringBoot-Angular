package it.eplastic.amazonintegration.api.obj.generic;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Header implements Serializable {

	@JsonProperty("DocumentVersion")
	private String documentVersion;
	@JsonProperty("MerchantIdentifier")
	private String merchantIdentifier;
	public String getDocumentVersion() {
		return documentVersion;
	}
	public void setDocumentVersion(String documentVersion) {
		this.documentVersion = documentVersion;
	}
	public String getMerchantIdentifier() {
		return merchantIdentifier;
	}
	public void setMerchantIdentifier(String merchantIdentifier) {
		this.merchantIdentifier = merchantIdentifier;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Header [documentVersion=");
		builder.append(documentVersion);
		builder.append(", merchantIdentifier=");
		builder.append(merchantIdentifier);
		builder.append("]");
		return builder.toString();
	}
	
	
}
