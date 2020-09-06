package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary() {
        return grossSalary - tax;
    }

    public void IncreaseSalary(double percentage) {
        grossSalary = grossSalary * (1 + (percentage/100.0));
    }

    public String toString() {
        return "Employee: "
                + name
                + ", "
                + "$ "
                + String.format("%.2f", NetSalary());
    }
}
