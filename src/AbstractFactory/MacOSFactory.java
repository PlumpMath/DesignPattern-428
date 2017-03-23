package AbstractFactory;

public class MacOSFactory implements IGUIFactory {

	@Override
	public IButton createButton() {
		// TODO Auto-generated method stub
		return new MacOSButton();
	}

}
