package it.emerc.world.security.DTO;

import javax.validation.constraints.NotBlank;

public class CityDto {

	@NotBlank
	private String name;
	@NotBlank
	private String countryCode;
	@NotBlank
	private String district;
	@NotBlank
	private String pulation;
	@NotBlank
	private String code;
	@NotBlank
	private String country_code2;
	@NotBlank
	private String continent;
	
	public CityDto(@NotBlank String name, @NotBlank String countryCode, @NotBlank String district,
			@NotBlank String pulation, @NotBlank String code, @NotBlank String country_code2,
			@NotBlank String continent) {
		super();
		this.name = name;
		this.countryCode = countryCode;
		this.district = district;
		this.pulation = pulation;
		this.code = code;
		this.country_code2 = country_code2;
		this.continent = continent;
	}
	public CityDto() {
	}
	
	
	
}
