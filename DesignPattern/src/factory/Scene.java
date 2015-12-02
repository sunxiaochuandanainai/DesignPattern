package factory;

public class Scene {

	public static void main(String[] args) {
		
		HumanAction black = HumanFactory.createHuman(HumanAction.BLACK);
		
		black.talk();
	}
}
