package it.wibs.eplastic.bindcommerceIntegration.api.obj.documents;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "Documents")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "totalDocumentsFounded",
    "Document",
})
public class DocumentsResponse {
	
	@JsonProperty("totalDocumentsFounded")
	private String totalDocumentsfounded;
	
	@JacksonXmlProperty(localName = "Document")
	private List<Document> documents;
	
	@JsonProperty ("errorCode")
	private String errorCode;
	
	@JsonProperty ("errorDescription")
	private String errorDescription;
	
	@JsonProperty ("token")
	private String token;

	public String getTotalDocumentsfounded() {
		return totalDocumentsfounded;
	}

	public void setTotalDocumentsfounded(String totalDocumentsfounded) {
		this.totalDocumentsfounded = totalDocumentsfounded;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}
	

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DocumentsResponse [Documents=");
		builder.append(documents.toString());
		builder.append(", errorCode=");
		builder.append(errorCode);
		builder.append(", errorDescription=");
		builder.append(errorDescription);
		builder.append(", token=");
		builder.append(token);
		builder.append("]");
		return builder.toString();
	}

	
	

	
}
