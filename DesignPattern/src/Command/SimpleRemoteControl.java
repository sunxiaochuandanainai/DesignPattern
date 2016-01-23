package Command;

public class SimpleRemoteControl {

	private Command slot;
	
	public void setSlot(Command slot) {
		this.slot = slot;
	}
	
	
	public void buttonWasPressed() {
		slot.execute();
	}
	
	
	public void backUp() {
		slot.undo();
	}
	
}
