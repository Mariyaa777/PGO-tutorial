import java.util.ArrayList;

public class Developer extends Employee {
	
    public ArrayList<Technology> technologies = new ArrayList<>();

	Developer(String firstName, String lastName, String address, String email, 
			String PESEL, int yearOfEmployment) throws IllegalArgumentException {
		super(firstName, lastName, address, email, PESEL, yearOfEmployment);
	}
	
	public void addTechnology(Technology technology){
		this.technologies.add(technology);
	}
	
	@Override
	public int calculateSalary() {
		int salary = super.calculateSalary();
		
		for (Technology technology : technologies) {   
			salary += technology.bonus;
	    }
		 
		return salary;
	}
}
