package Singelton;
/***
 * 在某些時候, 為了管控資源或是避免多個物件分享相同資源造成的 Race condition, 
 * 我們希望在同一時間, 某個類別只會存在一個唯一的物件, 這時你便可以利用這個設計模式.
 * 
 * 該class負責自己創造自己的object，同時確保只有一個object被產生出來
 * 要素：
 * 		1. 要有一個private static方法來紀錄class的instance。因為是private，所以外部沒辦法直接透過Single.instance來存取。
		2. class要有一個private constructor：其他的方法沒辦法直接產生這個class的instance，就是不能夠用new Single()這樣的方式來產生object。
		3. 要有一個public getter：由於是private constructor的原因，要產生該class的instance，只能靠自己class內的方法產生。
		   但是又必須要讓外部能夠呼叫，所以要設定public static
 * @author Chrisyknip
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Singelton singelton = new Singelton(); -> constructor是private所以不同class的人不能call他，更不能隨意生成物件
		Singelton singelton = Singelton.getInstance();
		singelton.showMsg();
		
		Singelton singelto2 = Singelton.getInstance();
	}

}
