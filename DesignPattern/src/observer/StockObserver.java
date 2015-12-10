package observer;

public class StockObserver implements Observer {

	
	private static int observerIDTracker = 0;
	
	private int observerID;
	
	
	public StockObserver() {
		
		observerIDTracker++;
		observerID = observerIDTracker;
	}
	
	
	
	
	@Override
	public void update(Object obj, Object message) {
		
		StockGrabber stockGrabber = (StockGrabber) obj;
		System.out.println( "ibm price : " + stockGrabber.getIbmPrice() );
		System.out.println( "google price : " + stockGrabber.getGooglePrice() );
		System.out.println( "apple price : " + stockGrabber.getApplePrice() );
	}
	
}
