package bad_example;

public class Employee {
    String name;
    String role;
    Double salary;

    public Employee(String name, String role, Double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public void updateSalary() {
        if (role.equals("Teacher")) salary += 5000;
        if (role.equals("Accountant")) salary += 10000;
        System.out.println("Updated salary: " + salary);
    }

    public void work() {
        System.out.println("Employee is working");
    }

    public static void main(String[] args) {
        Employee t1 = new Employee("Ali", "Teacher", 50000.0);
        t1.work();
        t1.updateSalary();

        Employee a1 = new Employee("Reyna", "Accountant", 84000.0);
        a1.work();
        a1.updateSalary();
    }
}
