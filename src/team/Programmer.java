package team;

public class Programmer {
 public String       fullname;   // полное имя
 public int          experience; // опыт работы (лет)
 public int          age;        // возраст (лет!!!)
 public float        salary;     // текущая заработная плата (в у.е.!!!)
 public String       technology; // название языка программирования, которым владеет (например, Java, Python,...)
 // добавить конструктор и методы, указанные выше
 	   
	//constructor PROGRAMMER   
	public Programmer(String fullname, int experience, int age, float salary, String technology){
			this.fullname = fullname;
			setExperience( experience );
			setAge(age);
			setSalary( salary );
			this.technology = technology;
	}
	
	// Get-Set experience PROGRAMMER
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
	
	// Get-set age PROGRAMMER
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
	
	// Get-set salary PROGRAMMER
	public float getSalary() {
			return this.salary;
	} 
	
	public void setSalary( float salary) {
			if( salary > 0 && salary < 5000) {
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
		this.salary = (float)(this.salary * 1.05 + this.experience * (this.salary * 0.01));
	}
	
	public float getSalaryInYears(int year) {
		if (year == 0 ) {
			return getSalary();
		}
		float currentSalary = getSalaryInYears(year - 1);
		float futureSalary =  (float)(currentSalary * 1.05 + (this.experience + year) * (currentSalary * 0.01));
		return futureSalary;
	}
	
	public static void main(String[] args) {
		Programmer programmer = new Programmer("Iacov",2, 36, 800, "java");
//		System.out.println(programmer.getSalary());
//		System.out.println(programmer.getSalaryInYears(0));
//		System.out.println(programmer.getSalaryInYears(1));
		System.out.println(programmer.getSalaryInYears(2));
//		System.out.println(programmer.getSalaryInYears(3));
//		programmer.setSalary(6000);
//		programmer.setSalary(4500);
//		System.out.println(programmer.toString());
//		System.out.println(programmer.getSalary());
//		programmer.incrementSalary();
//		System.out.println(programmer.getSalary());
	}
	
}