package Lambda_Expressions_2;

public class Runner {

    public void classicalWay(){
        Calculation_implementation cai = new Calculation_implementation();
        System.out.println("From classical way : " + cai.calculation(1, 2));
    }

    public void Annonymous(){
        Calculation cal = new Calculation() {
            @Override
            public int calculation(int a, int b) {
                return a + b;
            }
        };
        System.out.println("From annonymous way : " + cal.calculation(1, 4));;
    }

    public void lambda(){
        Calculation calculation =  (int a, int b)-> {return a + b;}; // This is the one way of lambda expression declaration
        Calculation ca = (a, b)-> a+b; // This is a another way of lambda expression declaration
        System.out.println("From Lambda : " + calculation.calculation(1,5));
        System.out.println("From lambda : " + ca.calculation(5, 2));

    }

    public static void main(String[] args) {

        Runner r = new Runner();

        r.classicalWay();
        r.Annonymous();
        r.lambda();

    }
}
