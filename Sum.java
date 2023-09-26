import java.util.Scanner;
public class Sum {
	
	public static void main(String[]args) {
		int number1,number2,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		number1=sc.nextInt();
		System.out.println("Enter the second number");
		number2=sc.nextInt();
		sum=number1+number2;
		System.out.println("The sum is"+sum);
	}

}
