# java-design-patterns
A collection of design patterns from different sources. I'm thinking this as some kind of cheat-sheet for referencing, when in need for implementing a pattern at work or school. 


## Reading- and video material
**Videos**
* Darek Barnas - [Design Patterns video series](https://www.youtube.com/playlist?list=PLF206E906175C7E07)

**Books**
* Head First Design Patterns - [Amazon](https://www.amazon.com/Head-First-Design-Patterns-Brain-Friendly/dp/0596007124)

## Introductory notes

Excerpt of the introductory parts of Darek Barnas Design Patterns before going into the patterns themselves:

#### Classes
A class is a blueprint for how we model a specific concept in Java, since everything in Java is an Object,
and contains information about fields/instance variables (ie. what it knows) and its methods/functions (i
e. what it does). 

Taken from the Head First Design Patterns book - Program to an interface, not an implementation.<br>
Meaning that in order to do ourselves a favor and enable better testing and ease future development to your program, 
try as much as possible to develop against and interface/abstract class. 

#### Interfaces
Is a special class only containing abstract methods and public, static and final fields.<br>
The primary goal of an interface is the act as a "contract" of 
sorts for what functionality any class implementing it must have. <br>
It is an extremely powerful tool to master, since classes can implement several interfaces, thus connecting a lot inheritance trees and enabling them to communicate via 
an interface contract. 

#### Abstract Classes
A special type of Java class, where instead of creating a lot of methods and fields and all the related logic, 
 with abstract classes, we can get away with just specifying the signatures of the methods, even though an abstract class can consist 
 of both abstract and implemented methods whereas Interfaces are strictly abstract method signatures. 
  There are no abstract fields, since in the abstract class it would not make sense to have instance variables, since it is never directly created except one of its subclasses. 

#### Encapsulation
The concept of clearly limiting the scope of which a program can access specific data.
In Java Objects are a natural encapsulation of logical chunks and data, and as such we need to protect the data each instance is holding. 
To do this there are visibility modifiers on everything inside a class, meaning for example that we can control with the help of the private modifier,
to prevent other classes to get a hold of a field directly. (This will later be broken with the reflection-api)

#### Instance- & Local Variables
This is a matter of where the fields are located. If the field is inside a method, it is called a local variable, 
given that it no longer exists are the method is finished running.<br> 
Instance variables on the other hand, exists as part of the state of the class-instance,
meaning that methods can access and mutate the state of the class. This a another part of encapsulation.

#### Inheritance
Since Java is an OOP language, we can employ the technique of using "inheritance",to actively abstract out or specialize
the classes we are making. This is most clearly shown with the instance of two classes called "Dog" and "Cat", where both of these 
animals share some common characteristics like "eat()" or "move()", and thus these can be abstracted up into a more generic class
called "Animal". They will both have a new modifier "extends Animal", and are bound by contract to implement this behavior.<br>
Animal is now a <b>superclass</b> to the two <b>subclasses</b> Dog and Cat.
<br>
<br>
<b>Note:</b> Remember when you instantiate a subclass like "Dog", that all the fields of the superclass Animal, is inherited down to the
new instance of Dog, meaning that you only need to define the things that does Dog unique from Animal inside the class instead of all of it. <br>
This behavior is invoked by calling the `super()`-method in the Dog classes constructor.<br>
* A good way of finding out if a class should extend another, is to use the "Is A?" and "Has A?" method, to ask if:
    * Is a "Dog" an "Animal"? - Yes
    * Is a "Dog" a "Cat"? - No
* The "Has A"-method is good for deciding if something should be a field.
    * "Dog" has a "Height"? - Yes, make it a field.

Be careful to only use this on things that are actually related, meaning that the subclass is using most of the methods in the superclass.
Don't use it only for code reuse, since the logical connection between them will be hard to decipher. 

#### Polymorphism
An advanced concept to wrap the head around, polymorphism is the technique of writing a single method, which does not change its
  signature, but change its behavior depending on which class or subclass the method is called.<br> 
  This means that if an Animal class possesses the method `eat()`, then since the "Dog" class is inheriting from "Animal",
   it will get access to a similar method signature, which then can be specialized for how a dog eats.<br>
   This gives the added bonus of enabling us to group classes of type "Animal" together, and for each of them call their specified `eat()` method
<br>
<b>Note:</b> Often such high-level concepts like "Animal" or the like, is extracted to an Interface or Abstract Class, 
since the existence of something generic like "Animal", is not desirable, except for having a way to group all its subclasses together, while having a contract on a minimum of things a class derived from "Animal" must have.

<b>main-class</b><br>
This class is simply to give us an entrypoint into the program as a whole. It is usually also here that all classes are made,
so they can interact with each other. 

On method signature - Parameter,
On runtime you when giving a method a value - Argument.