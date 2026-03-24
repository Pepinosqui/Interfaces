public class Banana extends Fruit implements Edible {
	// Abstract methods definitions
	public String flavourType() {
		return "Sweet";
	}
	
	public String wayToEat() {
		return "Peeled";
	}
	
	public int caloriesGiven() {
		return 89;
	}
}
