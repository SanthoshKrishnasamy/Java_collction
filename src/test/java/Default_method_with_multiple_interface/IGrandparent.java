package Default_method_with_multiple_interface;

public interface IGrandparent {

    default void followRules(){
        System.out.println("Follow the rules always from Grand parent");
    }
}
