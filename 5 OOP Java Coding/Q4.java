import java.util.*;

class Employee {
    String name;
    protected String emp_id;

    protected Employee(String name, String emp_id){
        this.name = name;
        this.emp_id = emp_id;
    } 
}

public class Q4 {
    public static void main (String args []){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = input.nextInt();
    
        Employee [] employees = new Employee[n];
        System.out.println("Enter details:");
        for(int i=0; i<n; i++){
            String name = input.next();
            String emp_id = input.next();
            employees[i] = new Employee(name, emp_id);
        }
        
        for(Employee emp : employees){
            System.out.printf("%s %s\n", emp.name, emp.emp_id);
        }
        input.close();
    }
}
