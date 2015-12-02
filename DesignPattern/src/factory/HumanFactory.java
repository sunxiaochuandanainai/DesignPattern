package factory;

public class HumanFactory {
	
	
	
	public static HumanAction createHuman(int type) {
		
		HumanAction human = null;
		
		if ( HumanAction.BLACK == type )
			human = new BlackHuman();
		
		else if ( HumanAction.YELLOW == type )
			human = new YellowHuman();
		
		else if ( HumanAction.WHITE == type )
			human = new WhiteHuman();
		
		return human;
		
	}

}
