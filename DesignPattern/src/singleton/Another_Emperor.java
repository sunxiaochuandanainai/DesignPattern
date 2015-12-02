package singleton;

public class Another_Emperor {

	private volatile static Another_Emperor emperor = null;
	
	private Another_Emperor() {
		
	}
	
	
	public static Another_Emperor getInstance() {
		
		if ( null == emperor ) {
			synchronized (Another_Emperor.class) {
				
				if ( null == emperor )
					emperor = new Another_Emperor();
			}
		}
		
		return emperor;
	}
	
}
