package Observer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject newspaperOffice = new Subject();
		Observer jim = new Observer("Jim");
		Observer kim = new Observer("Kim");
		newspaperOffice.registerObserver(jim);
		newspaperOffice.registerObserver(kim);
		newspaperOffice.notifyObservers("March 23 - Todays' new is....");
		newspaperOffice.removeObserver(jim);
		newspaperOffice.notifyObservers("March 24 - Todays' new is....");
	}

}
