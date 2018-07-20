package B2Chap01;

//Code for DownCasting
class Employee {
	public Employee(){
		System.out.println("Employee");
	}
	public void print()
	{
		System.out.println("Employee Deatils");
	}
}
class Manager extends Employee{
	public Manager(){
		System.out.println("Manager");
	}
	public void print()
	{
		System.out.println("Manager Deatils");
	}
}
class Supervisor extends Employee{
	public Supervisor(){
		System.out.println("Supervisor");
	}
	public void print()
	{
		System.out.println("Supervisor Deatils");
	}
}
class Test1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1,emp2;
		Manager m1;
		Supervisor s1;
		emp1=new Manager();
		emp2=new Supervisor();
		Employee emp3=new Manager();
		m1=(Manager)emp1;
		s1=(Supervisor)emp2;
		emp3.print();
	}
}