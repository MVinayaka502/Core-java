//Write a method to calculate the area of a rectangle.
// The method should take the length and width as parameters and return the area.

import java.util.*;// import java.util.Scanner;
public class _13AreaOfTriangleWithReturn {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Length of the triangle: ");
        int len=scan.nextInt();
        System.out.println("Enter the width of the triangle: ");
        int wid=scan.nextInt();

        int results=AreaOfTriangle(len,wid);
        System.out.println("The Area of triangle is :"+results);
    }

    public static int AreaOfTriangle(int len,int wid){
        int area=len*wid;
        return area;
    }

}
