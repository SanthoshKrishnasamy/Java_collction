package All_Functional_Interfaces_in_java8.Consumer_funtional_interface;

import java.util.function.Consumer;

public class Cosumer_example_with_built_in_methode {


    public void lamdba(){

        Consumer<String> consumer1 = input-> System.out.println(input + " pubg player");

        Consumer<String> consumer2 = input-> System.out.println( input + " cricket player ");

        /*Consumer is a functional interface which is having one abstract method(accept) and default method(andThen)*/

        consumer1.accept("pro");

        consumer2.andThen(consumer1).accept("professional");
    }



    public static void main(String[] args) {

        Cosumer_example_with_built_in_methode c = new Cosumer_example_with_built_in_methode();

        c.lamdba();


    }



}
