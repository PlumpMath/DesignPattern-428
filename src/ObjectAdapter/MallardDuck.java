package ObjectAdapter;

public class MallardDuck implements IDuck {
	public String name;
	MallardDuck(String name){this.name = name;}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("MallardDuck "+ this.name +" quacks.");
	}

	@Override
	public void dWalk() {
		// TODO Auto-generated method stub
		System.out.println("MallardDuck "+ this.name +" walks.");
	}

}
