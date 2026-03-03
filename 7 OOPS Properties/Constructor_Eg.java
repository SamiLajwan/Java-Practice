class Human
{
	private int age;
	private String name;
	
	public Human()
	{
		age=12;
		name="John";
		//System.out.println("in constructor");
	}
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

public class Constructor_Eg {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();
		// Human obj1=new Human();
		//value will be of invoked constructor
		System.out.println(obj.getName()+" : "+obj.getAge());

		obj.SetAge(30);
		obj.setName("Reddy");
		//values will be of setters and getters
		System.out.println(obj.getName()+" : "+obj.getAge());
		

		//System.out.println(obj.getName()+" : "+obj.getAge());
	}
}