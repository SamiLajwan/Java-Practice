class Person
{
	//int age;
	//private int age=11;
	private int age;
	//String name;
	//private String name="Navin";
	private String name;
	
	public int getAge() // getters
	{
		return age;
	}
	public void SetAge(int a)  //setters
	{
		age=a;
	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name=n;
	}
}

public class Encapsulations {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Person obj=new Person();
		obj.SetAge(30);
		obj.setName("Reddy");
//		obj.age=11;
//		obj.name="Navin";
		
		System.out.println(obj.getName()+" : "+obj.getAge());
	
	}
}