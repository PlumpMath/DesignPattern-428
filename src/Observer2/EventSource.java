package Observer2;

import java.util.Observable;
import java.util.Scanner;

public class EventSource extends Observable implements Runnable {
	//被new出來之後就會call run
	@Override
	public void run() {
		System.out.println("進入run()");
		// TODO Auto-generated method stub
		while (true) {
            String response = new Scanner(System.in).next();
            setChanged();
            System.out.println("notifyObservers");
            notifyObservers(response);
            
        }
	}

}
