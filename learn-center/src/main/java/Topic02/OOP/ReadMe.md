## Java OOP

#### Lesson-01 Constructor
1) Default Constructor
2) No Args Constructor
3) Parametrized Constructor with No Args Constructor
4) Parametrized Constructor without No Args Constructor
5) Chaining Constructors
6) Implicit Call Parent Class Constructor
7) Explicit Call Parent class Constructor
8) Copy Constructor

#### Lesson-02 Static keyword
1) Single static block
2) Multiple static block
3) Static Method
4) Static Method directly Accessed In Static And Non-Static Methods
5) Static Variable
6) Static Variable shared between All Instances of Class
7) Static Class

#### Lesson-03 Inheritance
1) Single Inheritance
2) MultiLevel Inheritance
3) Hierarchical Inheritance
4) Multiple Inheritance Problem
5) Constructor in Inheritance
6) Inheritance and Method Overriding

#### Lesson-04 Association / Aggregation / Composition
1) Association
2) Aggregation
3) Composition

#### Lesson-05 Super keyword
1) How to use super keyword to access the variables of parent class
2) Use of super keyword to invoke constructor of parent class
3) How to use super keyword in case of method overriding

#### Lesson-06 Method Overloading
1) Overloading – Different Number of parameters in argument list
2) Overloading – Difference in data type of parameters
3) Overloading – Sequence of data type of arguments
4) Method Overloading and Type Promotion

#### Lesson-07 Method Overriding
1) Method Overriding
2) Method Overriding and Dynamic Method Dispatch
3) Rules of method overriding in Java:
   1) Argument list: The argument list of overriding method (method of child class) must match the Overridden method(the method of parent class). The data types of the arguments and their sequence should exactly match.
   2) Access Modifier of the overriding method (method of subclass) cannot be more restrictive than the overridden method of parent class. For e.g. if the Access Modifier of parent class method is public then the overriding method (child class method ) cannot have private, protected and default Access modifier,because all of these three access modifiers are more restrictive than public.
   3) private, static and final methods cannot be overridden as they are local to the class. However static methods can be re-declared in the sub class, in this case the sub-class method would act differently and will have nothing to do with the same static method of parent class.
   4) Overriding method (method of child class) can throw unchecked exceptions, regardless of whether the overridden method(method of parent class) throws any exception or not. However the overriding method should not throw checked exceptions that are new or broader than the ones declared by the overridden method.
   5) Binding of overridden methods happen at runtime which is known as dynamic binding.
   6) If a class is extending an abstract class or implementing an interface then it has to override all the abstract methods unless the class itself is a abstract class.

#### Lesson-08 Overloading vs Overriding
1) Overloading happens at compile-time while Overriding happens at runtime: The binding of overloaded method call to its definition has happens at compile-time however binding of overridden method call to its definition happens at runtime.
2) Static methods can be overloaded which means a class can have more than one static method of same name. Static methods cannot be overridden, even if you declare a same static method in child class it has nothing to do with the same method of parent class.
3) The most basic difference is that overloading is being done in the same class while for overriding base and child classes are required. Overriding is all about giving a specific implementation to the inherited method of parent class.
4) Static binding is being used for overloaded methods and dynamic binding is being used for overridden/overriding methods.
5) Performance: Overloading gives better performance compared to overriding. The reason is that the binding of overridden methods is being done at runtime.
6) private and final methods can be overloaded but they cannot be overridden. It means a class can have more than one private/final methods of same name but a child class cannot override the private/final methods of their base class.
7) Return type of method does not matter in case of method overloading, it can be same or different. However in case of method overriding the overriding method can have more specific return type (refer this).
8) Argument list should be different while doing method overloading. Argument list should be same in method Overriding.


#### Lesson09 Polymorphism
1) What is polymorphism in programming?
2) Runtime Polymorphism
3) compile time polymorphism

#### Lesson10 Static and Dynamic Binding
1) Static binding
2) Dynamic binding
3) Static vs Dynamic Bindings:
   1) Static binding happens at compile-time while dynamic binding happens at runtime.
   2) Binding of private, static and final methods always happen at compile time since these methods cannot be overridden. When the method overriding is actually happening and the reference of parent type is assigned to the object of child class type then such binding is resolved during runtime.
   3) The binding of overloaded methods is static and the binding of overridden methods is dynamic.

#### Lesson11 Abstract 
1) Why we need an abstract class?
2) Why can’t we create the object of an abstract class?

#### Lesson12 Interface

#### Lesson13 Encapsulation

#### Lesson14 Abstraction

#### Lesson15 Packages

#### Lesson16 AccessModifier

#### Lesson17 Final




