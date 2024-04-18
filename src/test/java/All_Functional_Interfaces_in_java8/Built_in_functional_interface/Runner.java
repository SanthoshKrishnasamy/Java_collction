package All_Functional_Interfaces_in_java8.Built_in_functional_interface;

import java.util.function.Function;

public class Runner {


    public void lambda(){
        //Function<T, t> --> It's a built_in interface in java which is having only one method know as apply(),
        // Usage --> When we don't have any separate Functional interface on that time we can use Function interface to store the lambda expression like below line
       Function<Integer, Double> UsdToInt = usd-> usd * 81.5;
        System.out.println(UsdToInt.apply(10));
    }

    public void annonymous(){

        //Instead of writing like this we are using the above lambda expression to reduse the line of code, but we can achieve the same things
        Function<Integer, Integer> f = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer usd) {
                return usd*82;
            }
        };
        System.out.println(f.apply(10));
    }


    public static void main(String[] args) {

        UsdToInr usdToInr = new UsdToInr();
        System.out.println( usdToInr.UsdToInr(10));

        Runner runner = new Runner();
        runner.lambda();
        runner.annonymous();

    }
}
