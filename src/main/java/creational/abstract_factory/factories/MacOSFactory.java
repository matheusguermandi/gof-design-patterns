package creational.abstract_factory.factories;

import creational.abstract_factory.buttons.MacOSButton;
import creational.abstract_factory.checkboxes.Checkbox;
import creational.abstract_factory.checkboxes.MacOSCheckbox;
import creational.abstract_factory.buttons.Button;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
