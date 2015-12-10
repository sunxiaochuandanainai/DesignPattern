package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 股票经纪人
 * @author barcelona
 *
 */

public class StockGrabber implements Observable {

	
	// 观察者列表
	private List<Observer> observers;
	
	private int googlePrice;
	private int applePrice;
	private int ibmPrice;
	
	
	// 控制什么时候notify
	private boolean changed = false;
	
	
	
	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		if ( changed ) {
			for ( Observer observer : observers )
				observer.update(this, null);
		}
		
		changed = false;
	}

	@Override
	public void setChanged() {
		// TODO Auto-generated method stub
		changed = true;
	}

	
	
	/*
	 * Setter && Getter
	 */

	public int getGooglePrice() {
		return googlePrice;
	}

	public void setGooglePrice(int googlePrice) {
		this.googlePrice = googlePrice;
		setChanged();
		notifyObservers();
	}

	public int getApplePrice() {
		return applePrice;
	}

	public void setApplePrice(int applePrice) {
		this.applePrice = applePrice;
		setChanged();
		notifyObservers();
	}

	public int getIbmPrice() {
		return ibmPrice;
	}

	public void setIbmPrice(int ibmPrice) {
		this.ibmPrice = ibmPrice;
		setChanged();
		notifyObservers();
	}

	
	
	
}
