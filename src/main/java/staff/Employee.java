package staff;

public abstract class Employee {
    private final String name;
    private final String NINo;
    private int salary;

    public Employee(String name, String NINo, int salary) {
        this.name = name;
        this.NINo = NINo;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNINo() {
        return this.NINo;
    }

    public double getSalary() {
        return (double) this.salary / 100;
    }

    public void raiseSalary(double salaryRaise) throws Exception {
        if (salaryRaise >= 0) {
            this.salary += salaryRaise * 100;
        } else {
            throw new Exception("Negative salary raises are not permitted");
        }

    }

    public double payBonus() {
        return this.salary * 0.01 / 100;
    }
}
