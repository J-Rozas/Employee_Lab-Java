package management;

public class Director extends Manager{

    private double budget;

    public Director(String name, String NINo, int salary, String deptName, double budget) {
        super(name, NINo, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }
}
