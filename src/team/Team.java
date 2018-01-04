package team;

public class Team{
	public Director director = new Director("Pechkin Ivan Jucovich", 25, 48, (float)1500); 
	public Manager helper = new Manager( "Petrov Piotr Piotrovich", 7, 35, (float)700 );
	public Programmer lead_developer = new Programmer("Cozlov Denis", 5, 29, 900, "java");
	public Programmer senior_developer = new Programmer("Cozlov Ion", 2, 28, 800, "java");
	public Programmer junior_developer = new Programmer("Cozlov Dima", 1, 27, 700, "java");
	public Tester quality_guy = new Tester("Vishkin Alex", 2, 23, 500, "phyton");
	
	public void printTeamMembers() {
		System.out.println(director.toString());
		System.out.println(helper.toString());
		System.out.println(lead_developer.toString());
		System.out.println(senior_developer.toString());
		System.out.println(junior_developer.toString());
		System.out.println(quality_guy.toString());
	}
}
