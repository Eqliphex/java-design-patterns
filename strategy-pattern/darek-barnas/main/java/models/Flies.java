package models;
// The interface is implemented by many other
// subclasses that allow for many types of flying
// without effecting Animal, or Flies.

// Classes that implement new Flies interface
// subclasses can allow other classes to use
// that code eliminating code duplication

// I'm decoupling : encapsulating the concept that varies

public interface Flies {

    String fly();

}

// Class used if the Animal can fly

//Class used if the Animal can't fly

class CantFly implements Flies {

    public String fly() {

        return "I can't fly";

    }

}
