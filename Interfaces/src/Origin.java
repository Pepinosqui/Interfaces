public class Origin {
	// Members
	private String country;
	private String region;
	private String producer;
	
	//CONSTRUCTORES
	public Origin(String country, String region, String producer) {
		this.country = country;
		this.producer = producer;
		this.region = region;
	}
	
	public Origin() {
		this.country = "None";
		this.producer = "None";
		this.region = "None";
	}
	
	// SETTERS
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}
	
	public void setProducer(String producer) {
		this.producer = producer;
	}
	
	// GETTERS
	public String getCountry() {
		return country;
	}
	
	public String getRegion() {
		return region;
	}
	
	public String getProducer() {
		return producer;
	}
}
