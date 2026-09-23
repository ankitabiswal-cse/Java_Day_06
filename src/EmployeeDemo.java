class Employee {
    String name;
    int salary;
    String domain;

    void display(){
        System.out.println("Employee Name ="+name);
        System.out.println("Employee Salary ="+salary);
        System.out.println("Employee Domain ="+domain);
    }
}
public class EmployeeDemo{
    public static void main(String[] args){
        Employee e1 = new Employee();
        e1.name = "Ankita Biswal";
        e1.salary = 30000;
        e1.domain = "Java FullStack Developer";

        e1.display();
    }
}
