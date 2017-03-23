package ObjectAdapter;

public class KingPenguin implements IPenguin {
	public String name;
	public KingPenguin(String name){this.name = name;}
	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		System.out.println("King penguin "+ this.name + " gobbles!");
	}

	@Override
	public void pWalk() {
		// TODO Auto-generated method stub
		System.out.println("King penguin "+ this.name + " walks!");
	}

}
