import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		// Reverse
		String reverse= new StringBuilder(String.valueOf(number)).reverse().toString();
		int revNum=Integer.parseInt(reverse);
		//expansion
		//pv=place value
		int pv=1000;
		boolean first=true;
		if(number<1000||number>9999){
		    System.out.println(number+" is an invalid number");
		}
		
		else{
		    System.out.println("Reversed number is "+revNum);
		  while(pv>0){
		    
		    int digit=revNum/pv;
		    int value=digit*pv;
		    
		    if(digit!=0){
		        if(!first){
		            System.out.print("+");
		        }
		        System.out.print(value);
		        first=false;
		    }
		    revNum=revNum%pv;
		    pv=pv/10;
		  }
		}
	}

}
