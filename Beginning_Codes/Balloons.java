import java.util.Scanner;

public class Balloons{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the height: ");
      int height = sc.nextInt();
      System.out.print("Enter the base: ");
      int base = sc.nextInt();
      double area = 0.5 * (base * height);
      System.out.println("The area is " + area + " square units.");
   }
}