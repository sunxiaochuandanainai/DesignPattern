package template;

public class Scene {
	
	public static void main(String[] args) {
		
		PizzaFactory meatPizzaFactory = new MeatPizzaFactory();
		meatPizzaFactory.makePizza();
		
		VegetarianPizzaFactory vegetarianPizzaFactory = new VegetarianPizzaFactory();
		vegetarianPizzaFactory.makePizza();
		
		
	}

}
