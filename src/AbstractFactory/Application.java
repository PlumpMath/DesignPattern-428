package AbstractFactory;

/***
 *	好處：high cohesion, low coupling - 不容易牽一髮而動全身
 *		物件的程式碼應該要有很高的比率只和物件內其他有關的程式碼有關聯，而對外部的程式碼，物件或元件等的關聯度要愈低愈好 (最佳的狀態是零耦合)。
 *		這樣做的用意是讓物件可以獨立的發展，而無須依賴外部的任何程式碼
 *		如此一來，物件本身可以在不影響其他程式的情況下自由的修改與變化，而外部程式的任何修改也不會影響到物件本身的功能與運作
 *  缺點：如果要加新的product(eg:加個IScroll跟WinScroll, MacScroll)很麻煩，要去改IFactroy跟WinFactory, MacFactory  
 * @author Chrisyknip
 *	圖：https://goo.gl/1yp8HP
 */
//the client software(在這裡就是Application)
public class Application {

	public static void main(String[] args) throws Exception{
		
		String os = randomAppearance();
		
		
		//因為一開始還不確定User是哪個OS，只知道不論哪個OS都要做Render一個Button
		//所以先宣告一個 abstract factory(裡面定義了abstract method createButton)
		IGUIFactory factory = null;
		//根據不同的OS，再看看要new abstract factory的哪一個concrete implementation
		if(os.equals("osx"))
			factory = new MacOSFactory();
		else if(os.equals("windows"))
			factory = new WindowsFactory();
		else
			throw new Exception("No sych OS");
		
		
		//一樣，不確定User是哪種OS，但反正一定會有一個Button，所以先宣告一個Button interface
		//反正這個interface可以接Win或是OSX的 instance都沒問題
		IButton button = factory.createButton();
		button.paint();
	}
	
	
	/**
	 * This is just for the sake of testing this program, and doesn't have to do
	 * with Abstract Factory pattern.
	 * @return
	 */
	public static String randomAppearance() {
		String[] appearanceArr = new String[3];
		appearanceArr[0] = "osx";
		appearanceArr[1] = "windows";
		appearanceArr[2] = "error";
		java.util.Random rand = new java.util.Random();
		int randNum = rand.nextInt(3);
		return appearanceArr[randNum];
	}
}
