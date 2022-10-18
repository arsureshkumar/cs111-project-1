/*
 * Project #1
 * Source Code File: PrintATable.java
 * Programmer: Arjun Suresh Kumar
 * Due: 9/13/21
 * Description: This is a Java programming exercise which
 * computes the area and perimeter of a circle.
 */

package Project1;

public class CircleAreaPerimeter {
    public static void main(String[] args){
        double radius = 5.5;
        double pi = 3.14159;
        
        double perimeter = 2 * radius * pi;
        double area = radius * radius * pi;

        System.out.println("Perimeter: "+ perimeter);
        System.out.println("Area: " + area);
    }
}
