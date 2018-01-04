package team;

/// MANAGER
public class Manager {
	public String       fullname;   // полное имя
	public int          experience; // опыт работы (лет)
	public int          age;        // возраст (лет!!!)
	public float        salary;     // текущая заработная плата (в у.е.!!!)
//	public Programmer   lead_developer;  // Объект тип Programmer - элитный разработчик в команде
//	public Programmer   senior_developer;// Объект тип Programmer - ведущий (senior) разработчик в команде
//	public Programmer   junior_developer;// Объект тип Programmer - младший (junior) разработчик в команде
//	public Tester       quality_guy;     // Объект тип Tester - тестировщик в команде
	// добавить конструктор и методы, указанные выше
	
		//constructor Manager
	
	public Manager(String fullname, int experience, int age, float salary){
			this.fullname = fullname;
			setExperience( experience );
			setAge(age);
			setSalary( salary );
	}
	
	// Get-Set experience MANAGER
	public int getExperience() {
			return this.experience;
	}
	
	public void setExperience(int experience) {
			if ( experience >= 0 && experience <= 45) {
				this.experience = experience;
			} else {
				System.err.println("The entered experience is wrong!");
			}
	}
	
	// Get-set age MANAGER
	public int getAge() {
			return this.age;
	}
	
	public void setAge( int age) {
	 	if ( age >= 18 && age <= 64) {
	 		this.age = age;
	 	} else {
	 		System.err.println("The entered age is wrong!");
			}
	}
	
	// Get-set salary MANAGER
	public float getSalary() {
			return this.salary;
	} 
	
	public void setSalary( float salary) {
			if( salary > 0 && salary < 3000) {
				this.salary = salary;
			} else {
				System.err.println("The entered amount of salary is invalid");
			}
	}
	
	public String toString() {
		String info = String.format("%-25s %-15s %-4d %-10d %-6.2f", this.fullname, this.getClass().getSimpleName(), this.age, this.experience, this.salary);
		return info;
	}
	
	public void incrementSalary() {
		this.salary = (float)(this.salary * 1.15);
	}
	
//	public static void main(String[] args) {
//		Manager manager = new Manager("Petrov", 10, 35, 1000);
//		System.out.println(manager);
//		manager.setSalary(2000);
//		System.out.println(manager.getSalary());
//		manager.incrementSalary();
//	}
}
