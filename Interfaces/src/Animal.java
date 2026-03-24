public abstract class Animal {
	// Members
	public String	name;
	public int		age;
	public double	weight;
	public Habitat	habitat;
	public Carer	carer;
	
	public Animal(String name, int age, double weight, Habitat habitat, Carer carer) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.habitat = habitat;
		this.carer = carer;
	}
	
	public Animal() {
		this.name = "None";
		this.age = 0;
		this.weight = 0.0;
		this.habitat = new Habitat();
		this.carer = new Carer();
	}
	
	// Methods
	public abstract String makeSound();
	public abstract String showInfo();
}
