package it.wibs.eplastic.bindcommerceIntegration.api.obj.documents;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "Documents")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Documents implements Serializable{
	
	@JacksonXmlProperty(localName = "Document")
	private List<Document> documents;

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Documents [documents=");
		builder.append(documents);
		builder.append("]");
		return builder.toString();
	}
	
	
}