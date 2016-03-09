package Strategy;

public class Robot {

	private IBehaviour behaviour;
	String name;
	
	public Robot(String name) {
		this.name = name;
	}
	
	public void move() {
		behaviour.moveCommand();
	}
	
	public void setBehaviour(IBehaviour behaviour) {
		this.behaviour = behaviour;
	}
	
	
}
