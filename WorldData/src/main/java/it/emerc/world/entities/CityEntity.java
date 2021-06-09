package it.emerc.world.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "city")
public class CityEntity implements Serializable{

	@Id
	@Column(name ="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;

	@Column(name ="Name")
	private String name;
	
	@Column(name ="CountryCode")
	private String countryCode;
	
	@Column(name ="District")
	private String district;
	
	@Column(name ="Population")
	private long population;
	
	@Column(name ="code")
	private String code;
	
	@Column(name ="country_code2")
	private String country_code2;
	
	@Column(name ="continent")
	private String continent;
	

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		population = population;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCountry_code2() {
		return country_code2;
	}

	public void setCountry_code2(String country_code2) {
		this.country_code2 = country_code2;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CityEntity [Id=");
		builder.append(Id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", countryCode=");
		builder.append(countryCode);
		builder.append(", district=");
		builder.append(district);
		builder.append(", Population=");
		builder.append(population);
		builder.append(", code=");
		builder.append(code);
		builder.append(", country_code2=");
		builder.append(country_code2);
		builder.append(", continent=");
		builder.append(continent);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
