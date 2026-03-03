import java.util.Scanner;

public class LaunchArray1
{
	public static void main(String[] args)
	{
		// create an array to store 5 students marks;
		int []marks=new int[5];
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Marks collection app");
		
		for(int i=0; i<marks.length; i++)
		{
			System.out.println("Kindly enter marks of student "+ i);
			marks[i] = scan.nextInt();
		}
		System.out.println("Marks are stored as follows");
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Marks of " + i + " student is: " + marks[i]+ " ");

		}
		System.out.println();
		scan.close();
	}
}
