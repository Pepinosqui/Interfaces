
public class Principal {

	public static void main(String[] args) {
		 // Crear origen
        Origin originApple = new Origin("USA", "Washington", "FreshFarm");

        // Crear info nutricional
        NutritionalInfo nutriApple = new NutritionalInfo(52, 10, 2.4, 0.3);

        // Crear manzana
        Apple apple = new Apple();
        apple.name = "Red Apple";
        apple.color = "Red";
        apple.weight = 150.5;
        apple.sweetness = "High";
        apple.origin = originApple;
        apple.nutritionalInfo = nutriApple;

        // Mostrar información
        System.out.println("Fruit: " + apple.name);
        System.out.println("Color: " + apple.color);
        System.out.println("Weight: " + apple.weight);
        System.out.println("Flavour: " + apple.flavourType());
        System.out.println("Way to eat: " + apple.wayToEat());
        System.out.println("Calories: " + apple.caloriesGiven());

        System.out.println("Origin Country: " + apple.origin.getCountry());
        System.out.println("Sugar: " + apple.nutritionalInfo.getSugar());
    }
	

}
