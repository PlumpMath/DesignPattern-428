package ObjectAdapter;


public class DuckAdapter implements IPenguin{
	IDuck duck;
	
	public DuckAdapter(IDuck duck) {
		this.duck = duck;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		duck.quack();
		System.out.println("...並且壓低聲音");
	}

	@Override
	public void pWalk() {
		// TODO Auto-generated method stub
		duck.dWalk();
		System.out.println("...並且翅膀向下伸直，左右搖擺");
	}

}
