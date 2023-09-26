/*
 *File       :Percentage.java
 *Description:Finding attendence mark
 *author     :sarya sajeev
 *version    :1.0
 *Date       :26/09/2023
*/

import java.util.Scanner;
public class Percentage {
	public static void main(String[]args) {
		int mark;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your mark");
		mark=sc.nextInt();
		if(mark>=90) {
			System.out.println("Grade obtained is S");}
		else if(mark>=80&&mark<90) {
			System.out.println("Grade obtained is A");}
		else if(mark>=70&&mark<80) {
			System.out.println("Grade obtained is B");}
		else if(mark>=60&&mark<70) {
			System.out.println("Grade obtained is C");}
		else if(mark>=50&&mark<60) {
			System.out.println("Grade obtained is D");}
		else {
			System.out.println("Fail");}
	}

}
