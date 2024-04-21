import java.util.ArrayList;
import java.util.Calendar;

public class Manager extends Employee {
	
    public ArrayList<Goal> achievedGoals = new ArrayList<>();

    Manager(String firstName, String lastName, String address, String email, 
			String PESEL, int yearOfEmployment) throws IllegalArgumentException {
		super(firstName, lastName, address, email, PESEL, yearOfEmployment);
	}
	
	public void addGoals(Goal goal){
		this.achievedGoals.add(goal);
	}
	
	@Override
	public int calculateSalary() {
		int salary = super.calculateSalary();

		Calendar c = Calendar.getInstance();
		int currentYear = c.get(Calendar.YEAR);
		int currentMonth = c.get(Calendar.MONTH) + 1;

		for (Goal goal : achievedGoals) {  
			if(goal.year == currentYear && goal.month == currentMonth) {
				salary += goal.bonus;
			}
	    }
		 
		return salary;
	}
}