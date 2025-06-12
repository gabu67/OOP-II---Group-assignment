package refactorization;

public class Accountant extends Employee{

    public Accountant(String name, Integer age, Double Salary) {
        super(name, age, Salary);
    }

    @Override
    void updateSalary() {
        Salary+=10000;
        System.out.println();
    }

    @Override
    void work() {
        System.out.println("refactorization.Accountant is filing taxes");
    }
}
