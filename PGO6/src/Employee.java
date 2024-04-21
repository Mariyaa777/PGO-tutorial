import java.util.Calendar;

public class Employee {
	public String firstName;
	public String lastName;
	public String address;
	public String email;
	public String PESEL;
	public int yearOfEmployment;
	
	private static int baseSalary = 3000;
    private static int annualSalaryIncrease = 1000;

	Employee(String firstName, String lastName, String address, 
			String email, String PESEL, int yearOfEmployment) throws IllegalArgumentException{
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
		this.PESEL = PESEL;

		Calendar c = Calendar.getInstance();
		int currentYear = c.get(Calendar.YEAR);
		
		if(yearOfEmployment <= currentYear) {
			this.yearOfEmployment = yearOfEmployment;
		}else {
			throw new IllegalArgumentException("The year of employment shoud not be greater than the current year"); 
		}
	}
	
	
	public int calculateSalary() {
		int salary = baseSalary;
		
		Calendar c = Calendar.getInstance();
		int currentYear = c.get(Calendar.YEAR);
		
		int diff = currentYear - this.yearOfEmployment;
		salary += diff * annualSalaryIncrease;
		
		return salary;
	}
}
