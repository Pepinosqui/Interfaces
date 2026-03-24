public class Chicken extends Animal implements Edible{
	// Abstract methods definition
	public String makeSound() {
		return "Cluck";
	}
	
	public String showInfo() {
		return "Lays eggs";
	}
	
	public String wayToEat() {
		return "Boiled";
	}
	
	public int caloriesGiven() {
		return 239;
	}
}
