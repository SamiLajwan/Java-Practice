public class LaunchEH1 {
	public static void main(String[] args)
	{
		System.out.println("Hello1");
		try 
		{
			Thread.sleep(500);
		} 
		catch (InterruptedException e)
		{
			System.out.println("Something happened");
		}
		System.out.println("Hello2");
//		Telusko t=new Telusko();
//		t.courses();
	}
}