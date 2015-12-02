package adapter;

public class Scene {

	
	public static void main(String[] args) {
		
		Human stone = new StoneAdapter( new Rock(23, "rock") );
		stone.think();
	}
	
}
