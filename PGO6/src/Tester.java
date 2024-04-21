import java.util.ArrayList;

public class Tester extends Employee {
	
    public ArrayList<String> typesOfTest = new ArrayList<>();
    
    private static int testTypeBonus = 300;

    Tester(String firstName, String lastName, String address, String email, 
			String PESEL, int yearOfEmployment) throws IllegalArgumentException {
		super(firstName, lastName, address, email, PESEL, yearOfEmployment);
	}
	
	public void addTestType(String testType){
		this.typesOfTest.add(testType);
	}
	
	@Override
	public int calculateSalary() {
		int salary = super.calculateSalary();
		
		salary += typesOfTest.size() * testTypeBonus;

		return salary;
	}
}
