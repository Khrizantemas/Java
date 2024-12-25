package pac4;

public class Main {
    public static void main(String[] args) {
        FixedSalaryEmployee fixedEmp = new FixedSalaryEmployee("zvigenaa", "shavi", "123-456-7890", 3000);
        fixedEmp.printDetails();

        DailySalaryEmployee dailyEmp = new DailySalaryEmployee("axmedi", "abdula", "098-765-4321", 20, 150);
        dailyEmp.printDetails();
    }
};