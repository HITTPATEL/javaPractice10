package day10.Q3;

public class Main {

}
//Q3) Explain abstract class and interface with an example.
//Answer 3
//Abstract class:
//                Abstracat  means hiding the implementation .This abstracat keyword we can apply on 2 places :
//1. On the class (abstract class)
//2. On the method (abstract method)

//(===>)We can not apply abstract keyword on variable or constructor

//Important point for abstract class :
//1.Inside normal class or concrete class we can not have abstract method/
//2.Abstract class may or may not have any abstract method.
//3.An empty class is also a valid abstract class.
//4. Abstract class does not havr=e any meaning until it is extended by any child class.
//5.We can not create abstract class object directly in class or in another class.
//6. If we want that no one create the object of a particular class then we should mark that class as an abstract class.
//7 Rule: If any class try to extend an abstract class must override allthe abstract methods of that abstract class otherwise we need 
//to mark that child class also as an abstract class.
// Abstract keyword and final keyword cannot live together.
//8.Inside abstract class we cannot assign abstract method as final.

//Example of abstract class :
//   A a1=new A() (It will give compile time error);
//     A a1=new Achild()  (This is right way to make object in abstract class)
//    A a1=null;  (This is also right way to make object in abstract class)
 

//Interace :
//           In java we can acheive the abstraction by two structures :-
//1. By using abstract class(Here we acheive partial abstraction 0-100%)
//2. By using Interface(Here we acheive full abstraction 100%);
// Example :
//   interface X{
//
//
//   }
//Important point for Interface :
// Interface is full implemented structure in which all method will be public abstract by default,
//There is no need of write abstract keyword before any method in Interface.
//We can not create Interface objects directly but we can create object of Interface indirectly
// by parent class reference and child class object.

// Example : Interface i1=new Interface() It will throw compile time error;
//           Interface i1=new InterfaceChild()  It will not give error.
//              Interface i1=null    It will not give any error.


