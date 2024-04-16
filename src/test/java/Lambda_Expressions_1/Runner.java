package Lambda_Expressions_1;

public class Runner {

    public void normalway(){
        Icar benz = new Benz();
        benz.start();
    }

    public void annonymos(){
        Icar ca = new Icar() {
            @Override
            public void start() {
                System.out.println("from annonymous");
            }
        };
        ca.start();
    }

    /*This is how we should declare lambda function,
    * To achieve lambda expression we should have functional interface*/
    public void lambda(){
        Icar c = ()-> System.out.println("from lambda");
        c.start();
    }
    public static void main(String[] args) {

        Runner run = new Runner();

        run.normalway();
        run.annonymos();
        run.lambda();
    }
}
