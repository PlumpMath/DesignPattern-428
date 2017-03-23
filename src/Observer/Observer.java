package Observer;

public class Observer implements IObserver {
	public String name;
	public Observer(String name){
		this.name = name;
	}
	@Override
	public void update(String msg) {
		// TODO Auto-generated method stub
		System.out.println(name + " received: " + msg);
	}

}
