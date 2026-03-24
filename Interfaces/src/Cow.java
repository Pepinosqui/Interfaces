public class Cow extends Animal implements Edible {
	// Abstract methods definition
	public String makeSound() {
		return "Moo";
	}
	
	public String showInfo() {
		return "Has horns";
	}
	
	public String wayToEat() {
		return "Grilled";
	}
	
	public int caloriesGiven() {
		return 250;
	}
}
