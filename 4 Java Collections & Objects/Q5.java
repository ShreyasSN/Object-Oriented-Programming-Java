import java.util.*;

class Person{
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int calculatePension( ){
        int pension = 0;
        if(age >= 60){
            pension = 500;
            if(age >= 70){
                pension += 100;
            }
        }
        return pension;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String name;
        int age;

        name = input.nextLine();
        age = input.nextInt();

        Person person = new Person(name, age);

        System.out.print(person.calculatePension());

        input.close();
    }
}
