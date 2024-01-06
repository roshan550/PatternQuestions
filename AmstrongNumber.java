import java.util.Scanner;
import java.math.*;


public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method   
//		a number is an amstrong number if the count of digits power
//		of each number sum equal to same number.
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scan.nextInt();
		checkAmstrong(n);
		
		


	}
	public static void checkAmstrong(int a) {
		int m=a;
		int count=0;
		while(m!=0) {
			count++;
			 m=m/10;
		}
		int r=a;
		int sum=0;
		int rem=0;
	   while(r!=0) {
		  rem=r%10;
		  sum+=Math.pow(rem,count);
		  r=r/10;
	   }
	   if(sum==a) {
	   System.out.print("Its an Amstrong number");
	   }
	   else {
		   System.out.print("Not an amstrong Number");
	   }
	}

}
