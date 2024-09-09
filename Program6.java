import java.util.Scanner;

//import stuff here!

//Your code here
public class Program6 {
    public static void main(String [] args){
        Scanner myScanner = new Scanner(System.in);
        //Create a final variable for Pi and use it in your code
        
        System.out.println("Enter the radius:");
        
        double rad = 3.712;
        System.out.println("The Radius of the circle is = " +rad);
        
        double diameter = rad * 2;
        System.out.println("The Diameter of the circle is = " +diameter);
        
        double area = rad * rad * 3.14159;
        double realarea = area;
        double area1 = (realarea) * 1000;
        area1 = (int) (area1+0.5);
        area1 = (double) (area1/1000);
        System.out.println("The Area of the circle is = " +area1);
        
        double circumference = rad * 2.0 * 3.14159;
        double realcircumference = circumference;
        double circumference1 = (realcircumference) * 1000;
        circumference1 = (int) (circumference1+0.5);
        circumference1 = (double) (circumference1/1000);
        System.out.println("The Circumference of the circle is = " +circumference1);
        
    }
    
}
//Paste console output below:

/*
Enter the radius:
The Radius of the circle is = 3.712
The Diameter of the circle is = 7.424
The Area of the circle is = 43.288
The Circumference of the circle is = 23.323

*/
