## Abstract Factory Design Pattern

The abstract factory pattern provides a way to encapsulate a group of individual factories that have a common theme without specifying their concrete classes.<br>
In normal usage, the client software creates a concrete implementation of the abstract factory and then uses the generic interface of the factory to create the concrete objects that are part of the theme. The client does not know (or care) which concrete objects it gets from each of these internal factories, since it uses only the generic interfaces of their products.<br>
This pattern separates the details of implementation of a set of objects from their general usage and relies on object composition, as object creation is implemented in methods exposed in the factory interface.

An example of this would be an abstract factory class ``DocumentCreator`` that provides interfaces to create a number of products (e.g., ``createLetter()`` and ``createResume()``).<br>
The system would have any number of derived concrete versions of the ``DocumentCreator`` class like ``FancyDocumentCreator`` or ``ModernDocumentCreator``, each with a different implementation of ``createLetter()`` and ``createResume()`` that would create a corresponding object like ``FancyLetter`` or ``ModernResume``.<br>
Each of these products is derived from a simple abstract class like ``Letter`` or ``Resume`` of which the client is aware. The client code would get an appropriate instance of the ``DocumentCreator`` and call its factory methods.<br>
Each of the resulting objects would be created from the same ``DocumentCreator`` implementation and would share a common theme (they would all be fancy or modern objects). The client would only need to know how to handle the abstract ``Letter`` or ``Resume`` class, not the specific version that it got from the concrete factory.

A factory is the location of a concrete class in the code at which objects are constructed. The intent in employing the pattern is to insulate the creation of objects from their usage and to create families of related objects without having to depend on their concrete classes. This allows for new derived types to be introduced with no change to the code that uses the **base class**.

Use of this pattern makes it possible to interchange concrete implementations without changing the code that uses them, even at runtime.<br>
However, employment of this pattern, as with similar design patterns, may result in unnecessary complexity and extra work in the initial writing of code. Additionally, higher levels of separation and abstraction can result in systems that are more difficult to debug and maintain.
