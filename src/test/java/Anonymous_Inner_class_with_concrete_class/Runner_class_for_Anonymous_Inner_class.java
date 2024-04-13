package Anonymous_Inner_class_with_concrete_class;

public class Runner_class_for_Anonymous_Inner_class extends Anonymous_Inner_class_parent{
    public static void main(String[] args) {
        
        /*Anonymous inner class with concrete class */

        // Creating object for parent class and acquiring the properties from them
        Anonymous_Inner_class_parent an = new Anonymous_Inner_class_parent();
        an.education();
        an.lifeStyle();
        an.marriage();

        // When you have class which is having one single implementation, that is the right time to use Anonymous inner class concept.
        //without creating an other class where we have to write for another method and implementation 
        Anonymous_Inner_class_Child anc = new Anonymous_Inner_class_Child();
        anc.marriage();


        // While creating the object for the parent class we could be able to use anonymous inner class
        Anonymous_Inner_class_parent anp = new Anonymous_Inner_class_parent()
        {
            public void marriage(){
                System.out.println("I will decide by myself and i came form anonymous inner class");
            }
        };

        // This method is coming from anonymous class
        anp.marriage();

    }
}
