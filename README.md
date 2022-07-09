🚀 Introduction
----------------
Welcome Here! The intent of this repo is to provide examples for each of the [23 Gang of Four design patterns](https://en.wikipedia.org/wiki/Design_Patterns)


📒 Design Patterns
----------------
Design patterns are typical solutions to commonly occurring problems in software design. They are like pre-made blueprints that you can customize to solve a recurring design problem in your code.

🔨 Creational Patterns
----------------

These patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code.

* [x] [Abstract Factory](https://github.com/matheusguermandi/gof_design_patterns/blob/master/src/main/java/creational/abstract_factory/Demo.java)
  * Define an interface or abstract class for creating families of related (or dependent) objects but without specifying their concrete sub-classes
* [x] [Builder](https://github.com/matheusguermandi/gof_design_patterns/blob/master/src/main/java/creational/builder/Demo.java)
  * Construct a complex object from simple objects using step-by-step approach.
* [x] [Factory Method](https://github.com/matheusguermandi/gof_design_patterns/blob/master/src/main/java/creational/factory_method/Demo.java)
  * Define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate.
* [x] [Prototype](https://github.com/matheusguermandi/gof_design_patterns/blob/master/src/main/java/creational/prototype/Demo.java)
  * Cloning of an existing object instead of creating new one and can also be customized as per the requirement.
* [x] [Singleton](https://github.com/matheusguermandi/gof_design_patterns/blob/master/src/main/java/creational/singleton/Demo.java)
  * Define a class that has only one instance and provides a global point of access to it

🚡 Structural Patterns
----------------

These patterns explain how to assemble objects and classes into larger structures while keeping these structures
flexible and efficient.

* [x] [Adapter](https://github.com/matheusguermandi/gof_design_patterns/blob/master/src/main/java/structural/adapter/Demo.java)
  * Converts the interface of a class into another interface that a client wants.
* [x] [Bridge](https://github.com/matheusguermandi/gof_design_patterns/blob/master/src/main/java/structural/bridge/Demo.java)
  * Decouple the functional abstraction from the implementation so that the two can vary independently.
* [x] [Composite](https://github.com/matheusguermandi/gof_design_patterns/blob/master/src/main/java/structural/composite/Demo.java)
  * Allow clients to operate in generic manner on objects that may or may not represent a hierarchy of objects.
* [x] [Decorator](https://github.com/matheusguermandi/gof_design_patterns/blob/master/src/main/java/structural/decorator/Demo.java)
  * Attach a flexible additional responsibilities to an object dynamically.
* [x] [Facade](https://github.com/matheusguermandi/gof_design_patterns/blob/master/src/main/java/structural/facade/Demo.java)
  * Provide a unified and simplified interface to a set of interfaces in a subsystem, therefore it hides the complexities of the subsystem from the client
* [x] [Flyweight](https://github.com/matheusguermandi/gof_design_patterns/blob/master/src/main/java/structural/flyweight/Demo.java)
  * Reuse already existing similar kind of objects by storing them and create new object when no matching object is found
* [x] [Proxy](https://github.com/matheusguermandi/gof_design_patterns/blob/master/src/main/java/structural/proxy/Demo.java)
  * Provides the control for accessing the original object

🔗 Behavioral Patterns
----------------

These patterns are concerned with algorithms and the assignment of responsibilities between objects.

* [x] [Chain of Responsibility](https://github.com/matheusguermandi/gof_design_patterns/blob/master/src/main/java/behavioral/chain_of_responsibility/Demo.java)
  * Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.
* [x] [Command](https://github.com/matheusguermandi/gof_design_patterns/blob/master/src/main/java/behavioral/command/Demo.java)
  * Encapsulate a request under an object as a command and pass it to invoker object. Invoker object looks for the appropriate object which can handle this command and pass the command to the corresponding object and that object executes the command.
* [x] [Iterator](https://github.com/matheusguermandi/gof_design_patterns/blob/master/src/main/java/behavioral/iterator/Demo.java)
  * Access the elements of an aggregate object sequentially without exposing its underlying implementation.
* [x] [Mediator](https://github.com/matheusguermandi/gof_design_patterns/blob/master/src/main/java/behavioral/mediator/Demo.java)
  * Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.
* [x] [Memento](https://github.com/matheusguermandi/gof_design_patterns/blob/master/src/main/java/behavioral/Mmmento/Demo.java)
  * Without violating encapsulation, capture and externalize an object's internal state so that the object can be returned to this state later.
* [x] [Observer](https://github.com/matheusguermandi/gof_design_patterns/blob/master/src/main/java/behavioral/observer/Demo.java)
  * Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
* [x] [State](https://github.com/matheusguermandi/gof_design_patterns/blob/master/src/main/java/behavioral/state/Demo.java)
  * Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.
* [x] [Strategy](https://github.com/matheusguermandi/gof_design_patterns/blob/master/src/main/java/behavioral/strategy/Demo.java)
  * Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently of the clients that use it.
* [x] [Template Method](https://github.com/matheusguermandi/gof_design_patterns/blob/master/src/main/java/behavioral/template_method/Demo.java)
  * Define the skeleton of an algorithm in an operation, deferring some steps to client subclasses.
* [x] [Visitor](https://github.com/matheusguermandi/gof_design_patterns/blob/master/src/main/java/behavioral/visitor/Demo.java)
  * Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.