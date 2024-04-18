package Method_chaining_using_Built_in_Function_interface;

import java.util.function.Function;

public class andThenANDCompose {

    public static void main(String[] args) {

        Function<Integer, Integer> plus = (b)->
        {
            System.out.println("Addition : " + (b+b));
            return b+b;
        };

        Function<Integer, Integer> multiply = c->
        {
            System.out.println("Multiply : " + (c*c));
            return c*c;
        };

        /* NOTE-->  This andThen & compose are the built-in functions in Function interface,
                    By using this we can be able to achieve the method chaining concept  */

        plus.andThen(multiply).apply(2);

        System.out.println("===============");

        plus.compose(multiply).apply(4);

    }
}
