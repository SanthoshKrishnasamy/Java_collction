package All_Functional_Interfaces_in_java8.Funtional_interface_basics;

@FunctionalInterface
public interface Browser {
    void browse();

    default void playmedia(){
        System.out.println("play media from browser");
    }


    /*NOTE-->    When class implements the interface it's should provide the declaration for all the um-implemented methods,
    *             But when any of the class don't want any one of method to provide implementation on that point,
    *               that particular method should be declared as default, so that it can have their own implementation either we can use the default implementation or
    *               we can provide our implementation */

    /*NOTE-->    When we declare functional interface it should contain only one abstract method,
                 But when we are declare method by using default keyword that method should have own implementation,
                    so that it won't affect whom ever the class which implements that functional interface*/

    /*NOTE-->   chrome is using the same implementation of browser, But edge and firefox is using their own implementation,
    *            This is how it will work either, it will use that interface implementation or  it will use their own implementation,
    *               But that method has to be declare as default  */
}
