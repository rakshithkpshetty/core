import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter weight in kg");
		double weight=sc.nextDouble();
		System.out.println("Enter height in cm");
		double height=sc.nextDouble();
		
		double bmi=weight/((height/100)*(height/100));
		
		 System.out.printf("Your BMI is %.2f. ",bmi);
	if((bmi>=18.5)&&(bmi<25)){
	    System.out.println("You are fit and healthy");
	    
	}
	else if(bmi>=25){
	    System.out.printf("You are overweight\n");
	    double bmireduce=bmi-25;
	    System.out.printf("Reduce %.2f kg to be fit",bmireduce);
	}
	else{
	     System.out.printf("You are underweight\n");
	    double bmigain=18.5-bmi;
	    System.out.printf("Gain %.2f kg to be fit",bmigain);
	}
	sc.close();

}
}
