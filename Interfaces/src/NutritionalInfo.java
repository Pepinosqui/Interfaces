public class NutritionalInfo {
	// Members
	private double calories;
	private double sugar;
	private double fiber;
	private double proteins;
	
	// CONSTRUCTORES
	public NutritionalInfo(double calories, double sugar, double fiber, double proteins) {
		this.calories = calories;
		this.fiber = fiber;
		this.sugar = sugar;
		this.proteins = proteins;
	}
	
	public NutritionalInfo() {
		fiber = sugar = proteins = calories = 1.0;
	}
	
	// SETTERS
	public void setCalories(double calories) {
		this.calories = calories;
	}
	
	public void setSugar(double sugar) {
		this.sugar = sugar;
	}
	
	public void setFiber(double fiber) {
		this.fiber = fiber;
	}
	
	public void setProteins(double proteins) {
		this.proteins = proteins;
	}
	
	//GETTERS
	public String getCalories() {
		return String.valueOf(calories);
	}
	
	public String getFiber() {
		return String.valueOf(fiber);
	}
	
	public String getSugar() {
		return String.valueOf(sugar);
	}
	
	public String getProteins() {
		return String.valueOf(proteins);
	}
}