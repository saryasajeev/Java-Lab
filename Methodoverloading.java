/*
 * File        : Methodoverloading.java
 * Description : To to calculate the area of different shapes using method overloading
 * Author      : SARYA SAJEEV
 * Version     : 1.0
 * Date        : 10/10/2023
 * 
 */

import java.util.Scanner;
public class Methodoverloading {
 public static void main(String[] args) {
	 Shape shape=new Shape();
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the base of triangle:");
		float base=sc.nextFloat();
		
		System.out.print("enter the height of triangle:");
		float height=sc.nextFloat();
	
		System.out.print("enter the length of rectangle:");
		int length=sc.nextInt();
		
		System.out.print("enter the breadth of rectangle:");
		int breadth=sc.nextInt();
		
		System.out.print("enter the radius of circle:");
		float radius=sc.nextFloat();
		Shape.area(height,base);
		Shape.area(length,breadth);
		Shape.area(radius);
		
	}

}
class Shape{
	
	public static void area(int length,int breadth) {
		System.out.println("Area of Rectangle with width:"+length+" and breadth:"+breadth+" is:"+(length*breadth));
	}
	public static void area(float height,float base) {
		System.out.println("Area of triangle with base:"+base+" and height:"+height+" is:"+(0.5*height*base));
	}
	public static void area(float radius) {
		System.out.println("Area of circle with radius:"+radius+" is:"+(3.14*radius*radius));
	}
}