package Anonymouse_inner_class_with_interface;

public class Runner extends child{
    public static void main(String[] args) {

        child c =  new child();
        c.marriage();


        /*It's not possible to create object for interface, but here we did that,
         because we want to achieve anonymous inner class, So that its possible to create object for Interface,
         But creating object for interface its not possible because those interface does not have any implementation with them */
        Iparent obj = new Iparent() {
            @Override
            public void marriage() {
                System.out.println("I will decide and i came from anonymous inner class");
            }
        };

        obj.marriage();

    }
}
