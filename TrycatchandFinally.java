package javaLab;
import java.util.Scanner;
public class TryCatchAndFinally {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	char choice='y';
		while (choice=='y'){
		try {
			System.out.println("enter the 1st number:");
			int num1=sc.nextInt();
			System.out.println("enter the 2nd number:");
			int num2=sc.nextInt();
			int result=num1/num2;
			System.out.println("Result="+result);
		}
		catch(ArithmeticException obj) {
			System.out.println("Division by Zero is not possible");
		}
		finally {
			System.out.println("End of Operation");
			
		}
		System.out.println("DO U WANT TO CONTINUE??(Y/N)");
		choice=sc.next().charAt(0);
	}
}
}
