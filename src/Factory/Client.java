package Factory;

import Factory.components.Button.Button;
import Factory.components.Dropdown.Dropdown;
import Factory.components.Menu.Menu;

public class Client {
    public static void main(String[] args) {
//        Platform p = new Android();

        String str = "Android"; //
        Platform p = Platform.getPlatform(str);

        UIComponentFactory uiComponentFactory = p.createUIComponentFactory();
        Button b = uiComponentFactory.createButton();
        Dropdown d = uiComponentFactory.createDropdown();
        Menu m = uiComponentFactory.createMenu();
    }
}