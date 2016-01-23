package Command;

public class ControlTest {

	public static void main(String[] args) {
		
		SimpleRemoteControl control = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand command = new LightOnCommand(light);
		
		control.setSlot(command);
		control.buttonWasPressed();
		control.backUp();
		
	}
	
}
