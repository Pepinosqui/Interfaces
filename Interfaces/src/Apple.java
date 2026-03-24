public class Apple extends Fruit implements Edible {
	// Abstract methods definitions
	
	public String flavourType() {
		return "Sweet";
	}
	
	public String wayToEat() {
		return "Fresh";
	}
	
	public int caloriesGiven() {
		return 52;
	}
}
