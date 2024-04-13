package Anonymouse_inner_class_with_abstract_class;

public class RunnerClass extends child{
    public static void main(String[] args) {

        //By extend the child and creating object for that we could be able to use both parent and child class properties

        child ob = new child();

        ob.education();
        ob.lifeStyle();
        ob.marriage();

        parent ph = new parent() {
            @Override
            public void marriage() {
                System.out.println("I will decide and i came from anonymous inner class");
            }
        };

        ph.marriage();

    }
}
