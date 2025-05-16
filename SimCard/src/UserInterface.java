import java.util.Scanner;

public class UserInterface{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the phone number");
        long number=sc.nextLong();
        int sumEven=0;
        int sumOdd=0;
        while(number>0){
           int digit = (int) (number%10);
           number=number/10;
        
        if((digit%2)==0){
            sumEven=sumEven+digit;
            System.out.println(sumEven);
        }
        else{
            sumOdd=sumOdd+digit;
        }
        }
        if(sumOdd==sumEven){
            System.out.println("Sum of odd and even are equal");
        }
        if(sumEven<sumOdd){
            System.out.println("Sum of odd is greater than sum of even");
        }
        if(sumEven>sumOdd){
            System.out.println("Sum of even is greater than sum of odd");
        }
    }
}