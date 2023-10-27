/************************************************************
 *File       :abstractclass.java
 *Description:To create an abstract class
 *author     :sarya sajeev
 *version    :1.0
 *Date       :27/10/2023
************************************************************/
public class abstractclass {
	public static void main(String[]args) {
		Rectangle rectangle=new Rectangle();
		Triangle triangle=new Triangle();
		Hexagon hexagon=new Hexagon();
		rectangle.numberOfSides();
		triangle.numberOfSides();
		hexagon.numberOfSides();
	}

}
       abstract class Shapes{
       abstract public void numberOfSides();
       }
       class Rectangle extends Shape{
    	   public void numberOfSides() {
    		   System.out.println("The number of sides of a rectangle is 4");
    	   }
       }
       
       class Triangle extends Shape{
    	   public void numberOfSides() {
    		   System.out.println("The number of sides of a Triangle is 3");
    	   }
       }
       class Hexagon extends Shape{
    	   public void numberOfSides() {
    		   System.out.println("The number of sides of a Hexagon is 6");
    	   }
       }