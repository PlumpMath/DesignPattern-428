package Singelton;
/***
 * 該class負責自己創造自己的object，同時確保只有一個object被產生出來
 * 有些物件只需要一個實例，比如設定和登入的物件、和驅動程式溝通的物件、執行緒池等，
 * 由於一次只會有一個實例產生，所以兩個instance有相同的位址
 * 好處：
 * 		Singelton pattern可以在任何地方存取這個instance，像全域變數一樣方便，且需要時才建立物件，不像全域變數程式一開始就建好物件，造成可能的資源浪費。
 * 
 * 注意：
 * 		singleton在multithread的應用場合下要小心，當unique instance尚未new出來時
 * 		如果有兩個thread同時調用創建方法，可能各自創建了一個instance，這樣就有兩個instance被new出來，違反了Singelton的原則
 * 
 * 要素：
 * 		1. 要有一個private static方法來紀錄class的instance。因為是private，所以外部沒辦法直接透過Single.instance來存取。
 *		2. class要有一個private constructor：其他的方法沒辦法直接產生這個class的instance，就是不能夠用new Single()這樣的方式來產生object。
 *		3. 要有一個public getter：由於是private constructor的原因，要產生該class的instance，只能靠自己class內的方法產生。
 *		   但是又必須要讓外部能夠呼叫，所以要設定public static
 * @author Chrisyknip
 *
 */
public class Singelton {
	//class中的static variable表示只有這麼唯一一個，private表示必須透過getter/setter來access
	private static Singelton uniqueInstance = new Singelton();
	//private constructor:所以要產生Single的instance只能在class內部產生，外部class不能new物件出來
	//也就是說確保類別Singleton 的物件化只能透過 API:getInstance()
	private Singelton(){}
	
	//public getter，該class下只會有一個物件，並且只能靠這個public getter來取得
	public static Singelton getInstance(){
        return uniqueInstance;
    }
	
	public void showMsg(){
		System.out.println("This is Singelton pattern");
	}
}
