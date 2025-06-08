public class Teacher extends Employee{
    public Teacher(String name, Integer age, Double Salary) {
        super(name, age, Salary);
    }

    @Override
    void updateSalary() {
        Salary+=5000;
        System.out.println(Salary);
    }
    @Override
    void work() {
        System.out.println("Teacher is teaching");
    }
}
