package Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
	List observers;
	Subject(){
		this.observers = new ArrayList<IObserver>();
	}
	@Override
	public void registerObserver(IObserver obs) {
		// TODO Auto-generated method stub
		this.observers.add(obs);
	}

	@Override
	public void removeObserver(IObserver obs) {
		// TODO Auto-generated method stub
		
		if(this.observers.indexOf(obs)>=0)
			this.observers.remove(obs);
			
	}

	@Override
	public void notifyObservers(String content) {
		// TODO Auto-generated method stub
		System.out.println("Notifying...");
		for(Object obs: this.observers)
			((IObserver)obs).update(content);
	}

}
