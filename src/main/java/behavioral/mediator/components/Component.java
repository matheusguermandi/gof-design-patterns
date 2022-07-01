package behavioral.mediator.components;

import behavioral.mediator.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
