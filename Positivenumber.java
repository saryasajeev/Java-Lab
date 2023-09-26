/*
 *File       :Percentage.java
 *Description:Finding attendence mark
 *author     :sarya sajeev
 *version    :1.0
 *Date       :26/09/2023
*/
import java.util.Scanner;
public class Positivenumber {
	public static void main(String[]args) {
		int sum=0,number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		number=sc.nextInt();
		while(number>0) {
			sum=sum+number;
			System.out.println("Enter the next number");
			number=sc.nextInt();
			}
		System.out.println("The Sum is:"+sum);
		
		
	}
	

}
