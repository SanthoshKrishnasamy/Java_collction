package All_Functional_Interfaces_in_java8.Predicate_funtional_interface_1;

public class Runner {
    public static void main(String[] args) {

        Predicate predicate = new Predicate();

        boolean b = predicate.eligible(13);
        System.out.println(b);

        /*Note--> Predicate is a functional interface, which is having one abstarct method (test).
                  When we want to perform certain action with the return type as yes or no // true or false
        *         That point of time we can use predicate interface
        * Usage --> when the method return boolean value we should use predicate */

       java.util.function.Predicate<Integer> eligible = (age)->(age>=18);
        System.out.println(eligible.test(19));
    }
}
