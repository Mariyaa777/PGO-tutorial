public class Employee extends Person {
    private int hireDate;
    private String companyName;
    private double salary;

    public Employee(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;
    }

    public int getJobSeniority() {
        return 2024 - hireDate;
    }

    public double getSalary() {
        return salary;
    }
}
