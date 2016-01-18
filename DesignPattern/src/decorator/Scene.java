package decorator;

public class Scene {

	public static void main(String[] args) {
		
		Beverage espresso = new Espresso();
		
		System.out.println( espresso.getDescription() + "\t" + espresso.cost() );
		
		
		espresso = new Mocha(espresso);
		System.out.println( espresso.getDescription() + "\t" + espresso.cost() );
		
		espresso = new Mocha(espresso);
		System.out.println( espresso.getDescription() + "\t" + espresso.cost() );
	}
	
}
