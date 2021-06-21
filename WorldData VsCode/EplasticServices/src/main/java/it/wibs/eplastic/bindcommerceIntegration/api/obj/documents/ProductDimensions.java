package it.wibs.eplastic.bindcommerceIntegration.api.obj.documents;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDimensions  implements Serializable{
	
	@JsonProperty("Weight")
	private String weight;
	
	@JsonProperty("WeightUom")
	private String weightUom;
	
	@JsonProperty("WeightVolume")
	private String weightVolume;
	
	@JsonProperty("LwhUom")
	private String lwhUom;
	
	@JsonProperty("Length")
	private String length;
	
	@JsonProperty("Width")
	private String width;
	
	@JsonProperty("Height")
	private String height;

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getWeightUom() {
		return weightUom;
	}

	public void setWeightUom(String weightUom) {
		this.weightUom = weightUom;
	}

	public String getWeightVolume() {
		return weightVolume;
	}

	public void setWeightVolume(String weightVolume) {
		this.weightVolume = weightVolume;
	}

	public String getLwhUom() {
		return lwhUom;
	}

	public void setLwhUom(String lwhUom) {
		this.lwhUom = lwhUom;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String lenght) {
		this.length = lenght;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String heigth) {
		this.height = heigth;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductDimensions [weight=");
		builder.append(weight);
		builder.append(", weightUom=");
		builder.append(weightUom);
		builder.append(", weightVolume=");
		builder.append(weightVolume);
		builder.append(", lwhUom=");
		builder.append(lwhUom);
		builder.append(", length=");
		builder.append(length);
		builder.append(", width=");
		builder.append(width);
		builder.append(", height=");
		builder.append(height);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
