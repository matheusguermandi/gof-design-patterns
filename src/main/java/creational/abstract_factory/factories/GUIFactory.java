package creational.abstract_factory.factories;

import creational.abstract_factory.checkboxes.Checkbox;
import creational.abstract_factory.buttons.Button;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}