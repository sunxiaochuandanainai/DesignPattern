package template;

public abstract class PizzaFactory {

	/**
	 * 制作生面团
	 */
	public void makeDough() {
		System.out.println("Make dough");
	}
	
	/**
	 * 添加调料
	 */
	public void addSauce() {
		System.out.println("Add Sauce");
	}
	
	public void addCheese() {
		System.out.println("Add Cheese");
	}
	
	public abstract void addTopping();
	
	
	
	/**
	 * 算法 的框架应该被声明为final
	 */
	public final void makePizza() {
		makeDough();
		addSauce();
		addCheese();
		addTopping();
	}
	
	
}
