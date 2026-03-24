public abstract class Fruit {
	// Members
	public String name;
	public String color;
	public double weight;
	public String sweetness;
	public Origin origin;
	public NutritionalInfo nutritionalInfo;
	
	public Fruit(String name, String color, double weight,
			String sweetness, Origin origin, NutritionalInfo nutritionalInfo) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.sweetness = sweetness;
		this.origin = origin;
		this.nutritionalInfo = nutritionalInfo;
	}
	
	public Fruit() {
		this.name = "None";
		this.color = "None";
		this.weight = 0.0;
		this.sweetness = "None";
		this.origin = new Origin();
		this.nutritionalInfo = new NutritionalInfo();
	}
	// Methods
	public abstract String flavourType();
}