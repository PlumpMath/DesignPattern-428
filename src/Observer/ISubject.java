package Observer;

public interface ISubject {
	public void registerObserver(IObserver obs);
	public void removeObserver(IObserver obs);
	public void notifyObservers(String content);
}
