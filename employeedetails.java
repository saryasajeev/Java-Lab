/*
 * File        : employeedetails.java
 * Description : To get the details of the employee
 * Author      : SARYA SAJEEV
 * Version     : 1.0
 * Date        : 17/10/2023
 * 
 */
import java.util.Scanner;
public class employeedetails {
	public static void main(String[]args) {
    Officer of=new Officer();
    Manager Ma=new Manager();
    System.out.println("Enter the details of Officer");
    of.setDetails();
    of.setspecialization();
    System.out.println("Officer Details");
    of.getDetails();
    of.getspecialization();
    System.out.println("Enter the details of Manager");
    Ma.setDetails();
    Ma.setdepartment();
    System.out.println("Manager details");
    Ma.getDetails();
    Ma.getdepartment();
   
    
	}

}
class Employee{
	String name;
	int age;
	long phoneno;
	int salary;
	String address;
	void setDetails() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name");
	name=sc.nextLine();
	System.out.println("Enter the age");
	age=sc.nextInt();
	System.out.println("Enter the Phone Number");
	phoneno=sc.nextLong();
	System.out.println("Enter the Salary");
	salary=sc.nextInt();
	System.out.println("Enter the address");
	sc.nextLine();
	address=sc.nextLine();
	
   }
	void getDetails() {
		System.out.println("Name is "+name);
		System.out.println("Age is "+age);
		System.out.println("Phone Number is "+phoneno);
		System.out.println("Address is "+address);
		System.out.println("Salary is "+salary);
	}
}
class Officer extends Employee{
	String specialization;
		void setspecialization() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the specialization");
		specialization=sc.nextLine();
	}
	void getspecialization() {
		System.out.println("Specialization is"+specialization);
   }
}
class Manager extends Employee{
	String department;
		void setdepartment() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Department");
		department=sc.nextLine();
	}
	void getdepartment() {
		System.out.println("Department is "+department);
		
	}
	}
	




	

