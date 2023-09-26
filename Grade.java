import java.util.Scanner;
public class Grade {
	public static void main(String[]args) {
		int percentage;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Attendence Percentage");
		percentage=sc.nextInt();
		if(percentage>90) {
			System.out.println("10 mark is Obtained");
		}
		else {
			System.out.println("Mark Obtained is"+percentage/10);
	
			
		}
			
		
	}

}
