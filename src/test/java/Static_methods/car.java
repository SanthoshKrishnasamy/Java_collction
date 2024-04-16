package Static_methods;

public class car implements Interface_with_static_method{

    static void start(){
        System.out.println("Come from class");
    }
    public static void main(String[] args) {

        /*NOTE--> what we learn here, we could not able to override the static method from interface*/

        /*By creating object for this interface we could not able to use the Start() method, Because that method is a static method,
        * so that it's not possible to @override, By using interface name . method name we could be able to use that static method*/
        Interface_with_static_method.start();

        /*This start() method is come from car class, so that we could creating object or we can call them by using class name . method name*/
        car.start();
    }
}
