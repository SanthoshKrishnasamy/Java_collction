package All_Functional_Interfaces_in_java8.Predicate_method_chaining_2;

import java.util.function.Predicate;

public class Method_chaining_with_predicate {

    /*Predicate is functional interface which is having abstract method as (test) & (and) & (negate) is a default method*/

    Predicate<String> campusInterview;
    Predicate<String> degreeCompleted;

    Predicate<Boolean> opposite;

    public void orExample(){
        campusInterview = interviewInput->interviewInput.equalsIgnoreCase("yes");
        degreeCompleted = degressInput->degressInput.equalsIgnoreCase("No");

        System.out.println("OR condition : " + campusInterview.or(degreeCompleted).test("No"));

    }

    public void AndExample(){

        campusInterview = interviewInput->interviewInput.equalsIgnoreCase("yes");
        degreeCompleted = degreeInput->degreeInput.equalsIgnoreCase("yes");

        System.out.println("And condition : " + campusInterview.and(degreeCompleted).test("yes"));

    }

    public void negate(){

        opposite = input-> input;
        System.out.println("Negate condition : " + opposite.negate().test(false));


    }

    public static void main(String[] args) {

        Method_chaining_with_predicate methodChainingWithPredicate = new Method_chaining_with_predicate();

        methodChainingWithPredicate.AndExample();
        methodChainingWithPredicate.orExample();
        methodChainingWithPredicate.negate();

    }
}
