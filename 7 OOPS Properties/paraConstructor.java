class Employee
{
	private int age;
	private String name;
	
	public Employee()
	{
		age=12;
		name="John";
	}
	public Employee(String n) {
		this.age = 12; // Set default age
		name = n;
	}
	public Employee(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	
	
//	public Human()    //default constructor
//	{
//		age=12;
//		name="John";
//		//System.out.println("in constructor");
//	}
//	public Human(int a, String n)  //Parameterized constructor
//	{
//		age=a;
//		name=n;
//	}
	
	public int getAge(){
		return age;
	}
	public void SetAge(int age)
	{
		this.age=age;
	}	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}

public class paraConstructor
 {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Employee obj=new Employee();
		Employee obj1=new Employee(18, "Sami");
		Employee h1 = new Employee("Sami");
		System.out.println(obj.getName()+" : "+obj.getAge());
		System.out.println(obj1.getName()+" : "+obj1.getAge());
		System.out.println(h1.getName());
		
//		obj.SetAge(30);
//		obj.setName("Reddy");
		

		//System.out.println(obj.getName()+" : "+obj.getAge());
	}
}