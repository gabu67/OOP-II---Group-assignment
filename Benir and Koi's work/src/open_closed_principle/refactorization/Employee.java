package refactorization;

abstract public class Employee {
    String name;
    Integer age;
    Double Salary;
    public Employee(String name,Integer age,Double Salary){
        this.name=name;
        this.age=age;
        this.Salary=Salary;
    }
    abstract void updateSalary();
    /*
    In the event an employee's salary is raised or lowered.
    */
    //promoteEmployee;
    abstract void work();

    public static void main(String[] args) {
        Teacher t1= new Teacher("Ali",22,50000.00);
        t1.work();
        Employee a1=new Accountant("Reyna",33,84000.00);
        a1.work();
    }
}
