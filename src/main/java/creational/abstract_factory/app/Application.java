package creational.abstract_factory.app;

import creational.abstract_factory.buttons.Button;
import creational.abstract_factory.checkboxes.Checkbox;
import creational.abstract_factory.factories.GUIFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
