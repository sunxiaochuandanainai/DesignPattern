package observer;

public class Scene {

	public static void main(String[] args) {
		
		StockGrabber grabber = new StockGrabber();
		
		StockObserver stockObserver1 = new StockObserver();
		StockObserver stockObserver2 = new StockObserver();
		
		grabber.addObserver(stockObserver1);
		grabber.addObserver(stockObserver2);
		
		grabber.setIbmPrice(50);
		grabber.setApplePrice(10);
		
		
	}
	
}
