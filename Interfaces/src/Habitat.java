public class Habitat {
	// Members
	private String type;
	private String region;
	private double meanTemperature;
	
	// CONSTRUCTORES
	public Habitat(String type, String region, double meanTemperature) {
		this.meanTemperature = meanTemperature;
		this.region = region;
		this.type = type;
	}
	
	public Habitat() {
		this.meanTemperature = 20.0;
		this.region = "None";
		this.type = "None";
	}
	
	// SETTERS
	public void setType(String type) {
		this.type = type;
	}
	
	public void setRegion(String region) {
		this.region = region;
	}
	
	public void setMeanTemperature(double meanTemperature) {
		this.meanTemperature = meanTemperature;
	}
	
	// GETTERS
	public String getType() {
		return type;
	}
	
	public String getRegion() {
		return region;
	}
	
	public String getMeanTemperature() {
		return String.valueOf(meanTemperature);
	}
}
