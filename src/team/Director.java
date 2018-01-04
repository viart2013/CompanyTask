package team;

// DIRECTOR
public class Director {
   public String   fullname;   // полное имя
   public int      experience; // опыт работы (лет)
   public int      age;        // возраст (лет!!!)
   public float    salary;     // текущая заработная плата (в у.е.!!!)
   
	//constructor DIRECTOR   
	public Director(String fullname, int experience, int age, float salary){
		this.fullname = fullname;
		setExperience(experience);
		setAge(age);
		setSalary(salary);
	}
	
	// Get-Set experience DIRECTOR
	public int getExperience() {
		return this.experience;
	}
	
	public void setExperience(int experience) {
		if (experience >= 0 && experience <= 45) {
			this.experience = experience;
		} 
		else {
			System.err.println("The entered experience is wrong!");
		}
	}
	
	// Get-set age DIRECTOR
	public int getAge() {
		return this.age;
	}
	
	public void setAge( int age) {
	 	if (age >= 18 && age <= 64) {
	 		this.age = age;
	 	} 
	 	else {
	 		System.err.println("The entered age is wrong!");
		}
	}
	
	// Get-set salary DIRECTOR
	public float getSalary() {
			return this.salary;
	} 
	
	public void setSalary( float setsalary) {
		if (setsalary > 0 && setsalary < 5000) {
			this.salary = setsalary;
		} 
		else {
			System.err.println("The entered amount of salary is invalid");
		}
	}
	
	public String toString() {
		String info = String.format("%-25s %-15s %-4d %-10d %-6.2f", 
									this.fullname, 
									this.getClass().getSimpleName(), 
									this.age, 
									this.experience, 
									this.salary);
		return info;
	}
	
	public void incrementSalary() {
		this.salary = (float)(this.salary * 1.2);
	}
	
	//	public static void main(String[] args) {
	//		Director director = new Director("Ivanov", 15, 45, 1500);
	//		System.out.println(director.toString());
	////		director.setSalary(6000);
	////		director.setSalary(4500);
	////		System.out.println(director.toString());
	////		System.out.println(director.getSalary());
	////		director.incrementSalary();
	////		System.out.println(director.getSalary());
	//	}
}
