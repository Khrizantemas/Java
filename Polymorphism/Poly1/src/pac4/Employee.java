package pac4;

abstract class Employee {
    protected String name;
    protected String lastName;
    protected String phone;

    public Employee(String name, String lastName, String phone) {
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
    }

    public abstract double getSalary();

    public void printDetails() {
        System.out.println("Name: " + name + " " + lastName + ", Phone: " + phone + ", Salary: " + getSalary());
    }
}

class FixedSalaryEmployee extends Employee {
    private double salary;

    public FixedSalaryEmployee(String name, String lastName, String phone, double salary) {
        super(name, lastName, phone);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}

class DailySalaryEmployee extends Employee {
    private int daysWorked;
    private double dailyRate;

    public DailySalaryEmployee(String name, String lastName, String phone, int daysWorked, double dailyRate) {
        super(name, lastName, phone);
        this.daysWorked = daysWorked;
        this.dailyRate = dailyRate;
    }

    @Override
    public double getSalary() {
        return daysWorked * dailyRate;
    }
}