package creational.factory_method.factory;

import creational.factory_method.buttons.Button;
import creational.factory_method.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}
