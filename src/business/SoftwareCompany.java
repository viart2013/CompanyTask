package business;

import team.Team;

public class SoftwareCompany {
    public String       companyName;   // полное название компании
    public int          yearFounded;   // год основания
    public Address companyAddress;
    public Team companyStaff;
	public float  salaryBudget;    
	
	public SoftwareCompany() {
		this.companyName = "Enfire";
		this.yearFounded = 1900;
		this.companyAddress = new Address();
		this.companyStaff = new Team();
		this.salaryBudget = 0; 
	}
	
	public void showMembers() {
		String header = String.format("%-25s %-15s %-4s %-10s %-6s", "Fullname","Position","Age","Experience","Salary");
		System.out.println(header);
		companyStaff.printTeamMembers(); 
	}
	
	public float calculateYearlySalary(int year) {
		System.out.println("");
		this.salaryBudget = 12 * (
				companyStaff.director.getSalary() +
				companyStaff.helper.getSalary() +
				companyStaff.junior_developer.getSalaryInYears(year) +
				companyStaff.lead_developer.getSalaryInYears(year) +
				companyStaff.senior_developer.getSalaryInYears(year) + 
				companyStaff.quality_guy.getSalaryInYears(year)
				);
		return this.salaryBudget;
	}
	
	public float calculate3YearSalary() {
		float firstYear = calculateYearlySalary(0);
		float secondYear = calculateYearlySalary(1);
		float thirdYear = calculateYearlySalary(2); 
		salaryBudget = firstYear + secondYear + thirdYear;
		
		return this.salaryBudget;
	}
	
	public static void main(String[] args) {
		SoftwareCompany company1 = new SoftwareCompany();
		company1.showMembers();
		System.out.print("The First year Annual salary budget is: " + company1.calculateYearlySalary(0));
		System.out.print("The Second year Annual salary budget is: " + company1.calculateYearlySalary(1));
		System.out.print("The Third year Annual salary budget is: " + company1.calculateYearlySalary(2));
		System.out.print("Three year salary budget is: " + company1.calculate3YearSalary());
	}
}

