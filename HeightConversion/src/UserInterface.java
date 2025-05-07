import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height in cm");
		double
		f=30.48;
		double cm=sc.nextDouble();
		double foot=cm/f;
		System.out.printf("Height in feet is %.2f feet",foot);
		
	}

}
