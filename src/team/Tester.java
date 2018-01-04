package team;

//TESTER
public class Tester {
public String       fullname;   // полное имя
public int          experience; // опыт работы (лет)
public int          age;        // возраст (лет!!!)
public float        salary;     // текущая заработная плата (в у.е.!!!)
public String       technology; // название языка программирования, которым владеет (например Java, Python,...)
// добавить конструктор и методы, указанные выше
	
//constructor TESTER   
	public Tester(String fullname, int experience, int age, float salary, String technology){
			this.fullname = fullname;
			setExperience( experience );
			setAge(age);
			setSalary( salary );
			this.technology = technology;
	}
	
	// Get-Set experience TESTER
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
	
	// Get-set age TESTER
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
	
	// Get-set salary TESTER
	public float getSalary() {
			return this.salary;
	} 
	
	public void setSalary( float salary) {
			if( salary > 0 && salary < 2000) {
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
		this.salary = (float)(this.salary * 1.03 + this.experience * (this.salary * 0.005));
	}
	
	public float getSalaryInYears(int year) {
		if (year == 0) {
			return getSalary();
		}
		float currentSalary = getSalaryInYears(year - 1);
		return (float)(currentSalary * 1.03 + (this.experience + year) * (currentSalary * 0.005));
	}
	
	public static void main(String[] args) {
		Tester tester = new Tester("Iacov", 2, 36, 500, "java");
		System.out.println(tester.getSalary());
		System.out.println(tester.getSalaryInYears(0));
		System.out.println(tester.getSalaryInYears(1));
		System.out.println(tester.getSalaryInYears(2));
//		System.out.println(tester.getSalaryInYears(3));

//		tester.setSalary(6000);
//		tester.setSalary(4500);
//		System.out.println(tester.toString());
//		System.out.println(tester.getSalary());
////		tester.incrementSalary();
//		System.out.println(tester.getSalary());
	}
}
