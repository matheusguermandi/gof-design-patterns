package creational.abstract_factory;

import creational.abstract_factory.app.Application;
import creational.abstract_factory.factories.GUIFactory;
import creational.abstract_factory.factories.MacOSFactory;
import creational.abstract_factory.factories.WindowsFactory;

public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }

        app = new Application(factory);

        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }

}
