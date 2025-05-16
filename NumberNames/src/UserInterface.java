import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the number");
		String number=sc.next();
		
		String[] word={"zero","one","two","three","four","five","six","seven","eight","nine"};
		for(int i=0;i<number.length();i++){
		    int digit=number.charAt(i)-'0';
		    System.out.print(word[digit]+" ");
		}
	
		

}
}
