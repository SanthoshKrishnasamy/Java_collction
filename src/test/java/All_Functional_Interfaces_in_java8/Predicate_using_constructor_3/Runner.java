package All_Functional_Interfaces_in_java8.Predicate_using_constructor_3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Runner {
    public static void main(String[] args) {

        //Classical way to add value to the variable which we added in constructor

        /*Student san = new Student("san" , 90);
        Student sk  = new Student("sk" , 99);
        Student up  = new Student("up" , 98);
        Student malik = new Student("malik" , 40);
        Student body = new Student("body" , 60);
        Student bala = new Student("bala" , 56);

        List<Student> li = new ArrayList<>();

        li.add(san);
        li.add(sk);
        li.add(up);
        li.add(malik);
        li.add(body);
        li.add(bala);*/

        // Optimize the way of adding and assigning the value to variable which we declare in the constructor

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("san" , 90));
        studentList.add(new Student("sk", 39.90));
        studentList.add(new Student("up" , 39.90));
        studentList.add(new Student("malik" , 40));
        studentList.add(new Student("body" , 60));
        studentList.add(new Student("bala" , 56));

        Predicate<Student> studentPredicate = listInput -> listInput.getPercentage()<=40;

        for(Student student : studentList){
            if(studentPredicate.test(student)){
                System.out.println( student.getName());
            }
        }





    }
}
