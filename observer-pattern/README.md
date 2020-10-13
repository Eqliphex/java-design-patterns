## The Observer Pattern - Notes

### Purpose 
An object called "subject" or "publisher" maintains a list of dependencies, 
containing "observers" or "subscribers" and notifies them automatically of any
state changes, usually by calling one of their methods. 

To have many objects to receive an update, when a subscribed object changes.


### Benefits 
Loose coupling of objects, the subject/publisher doesn't need to know anything about
what who is subscribed to it. 

The only thing it does is to broadcast a change, and then
the subscribed observers will act accordingly. 

A thing to note, is that in this scenario the publisher may not always
broadcast something of value to all subscribers, meaning it needs some logic to handle it corrctly.



