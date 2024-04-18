package All_Functional_Interfaces_in_java8.Predicate_using_constructor_3;

public class Student {

    private String name;
    private double percentage;

    public  Student(String name, double percentage){
        this.name = name;
        this.percentage = percentage;
    }

    public String getName(){
        return name;
    }

    public  double getPercentage(){
        return percentage;
    }

}
