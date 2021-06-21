package it.wibs.eplastic.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class ItemEntity implements Serializable{
	
	@Id
	@Column(name="ID_ITEM")
	private String idItem;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="WEIGHT")
	private String weight;
	
	@Column(name="WEIGHT_UOM")
	private String weightUom;
	
	@Column(name="WEIGHT_VOLUME")
	private String weightVolume;
	
	@Column(name="LWH_UOM")
	private String lwhUom;
	
	@Column(name="LENGTH")
	private String length;
	
	@Column(name="WIDTH")
	private String width;
	
	@Column(name="HEIGHT")
	private String height;
	
	@Column(name="CATEGORY")
	private String category;

	public String getIdItem() {
		return idItem;
	}

	public void setIdItem(String idItem) {
		this.idItem = idItem;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

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

	public void setLength(String length) {
		this.length = length;
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

	public void setHeight(String height) {
		this.height = height;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ItemEntity [idItem=");
		builder.append(idItem);
		builder.append(", description=");
		builder.append(description);
		builder.append(", weight=");
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
		builder.append(", category=");
		builder.append(category);
		builder.append("]");
		return builder.toString();
	}
	
}