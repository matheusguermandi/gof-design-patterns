package behavioral.state;

import behavioral.state.ui.Player;
import behavioral.state.ui.UI;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
