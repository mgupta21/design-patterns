# Structural Pattern

# Behavioural Pattern

***Composite Design Pattern***
>> Purpose: Define the key internal data structure for the expression tree
>> Organization of objects as trees

***Proxy Design Pattern***
>> A client can use proxy to communicate to real object
>> Used when direct object access is not possible due to following reasons : 
    >> Object is not reachable 
        >> lives on another machine
        >> object swapped out to disk
        
    >> Some processing required
        >> security (eg. credentials check)
        >> audit trail
        
***Visitor Pattern***
>> Purpose: Perform an extensible set of operations on an expression tree without requiring any changes to the tree itself
>> Visitor decouples expression tree structure from operations performed on it
>> Adding new operations to an expression tree should require no changes to the structure and implementation of the tree itself
>> Operations: a. Print all values of nodes in tree b. Conduct semantic analysis of tree c. Evaluate "yield" of nodes in tree
>> Step 1: Create hierarchy of visitors to perform on each type of expression tree node
        
***Adapter Design Pattern***
>> Allows to add new better functionality without changing the client interface

***Facade Design Pattern***
>> Easier for the client
>> Easier to refactor implementation

***Observer Pattern***
>> Problem: clients / dependents needs to know when the temperature changes
>> 1. Introduce an interface that all dependents must implement - Observer
>> 2. Implement some kind of registry tphat allows the thermometer to keep track of the observers
>> 3. Implement the registration behavior in a reusable class that can be reapplied for other classes wih dependents - Observable

***Template Pattern***
>> Template method is often used in the context of building frameworks

# Structural Pattern

***Decorator Design Pattern***
>> Allows features to be added dynamically at runtime or allows user to add new functionality to an existing object without altering its structure.
>> This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.

# Creational Design Pattern

****Abstract Fatory***

***Builder****

***Prototype***

***Singelton***
