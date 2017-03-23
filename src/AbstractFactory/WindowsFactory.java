package AbstractFactory;

public class WindowsFactory implements IGUIFactory {

	@Override
	public IButton createButton() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}

}
