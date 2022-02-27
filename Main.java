import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    double p, l, b, ar ;
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter the Length:");
    l=scan.nextDouble();
    System.out.println("Enter the Breadth:");
    b=scan.nextDouble();
    ar=l*b;
    System.out.println("The area is: "+ar);
    p=2*(l+b);
    System.out.println("The perimeter: "+p);
   } 
  }
