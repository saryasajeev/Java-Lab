/************************************************************
 *File       :Primeornot.java
 *Description:To check whether a number is prime or not
 *author     :sarya sajeev
 *version    :1.0
 *Date       :31/10/2023
************************************************************/
import java.util.Scanner;
public class Primeornot {
	public static void main(String[]args){
		int num,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
			
		}
		if(count==0) {
			System.out.println("Number is Prime");
		}
		else {
			System.out.println("Number is not Prime");
		}
	}

}
