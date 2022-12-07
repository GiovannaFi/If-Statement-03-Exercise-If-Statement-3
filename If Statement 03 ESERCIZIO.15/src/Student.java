import java.util.Random;
import java.util.random.*;

public class Student {
    private String name;
    private int age;

    public Student(String studentName, int studentAge){
        this.name = studentName;
        this.age = studentAge;
    }
    public void guessingAge(){
        Random randomInt = new Random();
        int int_random = randomInt.nextInt(35);
        System.out.println("I generated the random number "+ int_random + " for student " + name);
        if (int_random == age) System.out.println("the random value is equal to the student's age");
        else if (int_random < age) System.out.println("the random value is lower to the Student's age");
        else System.out.println("the random value is greater to the Student's age");

    }

}
