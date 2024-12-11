import java.util.Scanner;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Emp extends Person {
    String emp_id;
    int salary;

    public Emp(String name, int age, String emp_id, int salary) {
        super(name, age);
        this.emp_id = emp_id;
        this.salary = salary;
    }
}

class Manager extends Emp {
    String managing_dep;
    int no_of_employees_working_under;

    public Manager(String name, int age, String emp_id, int salary, String managing_dep, int no_of_employees_working_under) {
        super(name, age, emp_id, salary);
        this.managing_dep = managing_dep;
        this.no_of_employees_working_under = no_of_employees_working_under;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of Managers: ");
        int numManagers = input.nextInt();
        input.nextLine(); // Consume newline left after reading integer

        Manager[] managers = new Manager[numManagers];
        System.out.println("Enter details:");
        for (int i = 0; i < numManagers; i++) {
            
            String name = input.next();
            int age = input.nextInt();
            String emp_id = input.next();
            int salary = input.nextInt();
            String managing_dep = input.next();
            int no_of_employees_working_under = input.nextInt();
            input.nextLine();
            
            managers[i] = new Manager(name, age, emp_id, salary, managing_dep, no_of_employees_working_under);
        }


        for (Manager manager : managers) {
            System.out.printf("%s %d %s %d %s %d\n",
                    manager.name, manager.age,
                    manager.emp_id, manager.salary,
                    manager.managing_dep, manager.no_of_employees_working_under);
        }
        input.close();
    }
}
