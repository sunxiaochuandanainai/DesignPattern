package decorator;

/**
 * 浓咖啡
 * @author barcelona
 *
 */
public class Espresso extends Beverage{

	
	
	public Espresso() {
		description = "Espresso";
	}
	
	
	@Override
	public double cost() {

		return 1.99;
	}
	
}
