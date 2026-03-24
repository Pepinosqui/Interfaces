public class Orange extends Fruit implements Edible {
	// Abstract methods definitions
	public String flavourType() {
		return "Citric";
	}
	
	public String wayToEat() {
		return "Peeled";
	}
	
	public int caloriesGiven() {
		return 47;
	}
}
