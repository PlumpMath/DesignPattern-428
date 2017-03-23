package ObjectAdapter;
/***
 * 圖：https://goo.gl/KeJHvq
 * @author Chrisyknip
 *
 */
public class Main {
	//case:動物園企鵝館的企鵝都生病，假設要把一隻鴨子(既有的)偽裝成一隻企鵝(觀眾要的)
	//把鴨子(adaptee)用DuckAdapter轉成企鵝(target)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("正版企鵝:");
		KingPenguin ken = new KingPenguin("Ken");
		ken.gobble();
		ken.pWalk();
		System.out.println("-----------------------");
		
		System.out.println("正版鴨子");
		MallardDuck amy = new MallardDuck("Amy");
		amy.quack();
		amy.dWalk();
		System.out.println("-----------------------");
		
		System.out.println("用鴨子裝成遊客要看的企鵝：把要轉的東西(鴨子)丟進adapter裡...");
		IPenguin duckAdapter = new DuckAdapter(amy);
		duckAdapter.gobble();
		duckAdapter.pWalk();
	}

}
