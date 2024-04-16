package Functional_Interface;

@FunctionalInterface
public interface Functional_interface {

    /*When an interface having single abstract method its know as @Functional interface, and it should not contain more than one abstract method within it.
    * To denote the functional interface we should use @FunctionalInterface annotation on top of the interface so that,
    * It won't allow to add more than one abstract method inside it*/

    /*NOTE ->  functional interface should have only one abstract method that is the rule,
        but it can contain some other methods which are declared in OBJECT class. because that class is a super most class in java we can utilize those methods
         to include in functional interface*/

    void fun();

    int hashCode();
    /* This method is come from OBJECT class so that it's not showing any error at compile time,
     But if we are declaring any method which is not belongs to OBJECT class it will show error at compile time */


}
