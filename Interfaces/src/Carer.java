public class Carer {
	// Members
	private String name;
	private String speciality;
	private int experienceYears;
	
	// CONSTRUCTORES
	public Carer(String name, String speciality, int experienceYears) {
		this.name = name;
		this.speciality = speciality;
		this.experienceYears = experienceYears;
	}
	
	public Carer() {
		this.name = "None";
		this.speciality = "None";
		this.experienceYears = 0;
	}
	
	// SETTERS
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	public void setExperinceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}
	
	// GETTERS
	public String getName() {
		return name;
	}
	
	public String getSpeciality() {
		return speciality;
	}
	
	public String getExperienceYears() {
		return String.valueOf(experienceYears);
	}
}