package observer;

/**
 * 主题发布者
 * @author barcelona
 *
 */
public interface Observable {

	public void addObserver(Observer observer);
	
	public void deleteObserver(Observer observer);
	
	public void notifyObservers();
	
	public void setChanged();
}
