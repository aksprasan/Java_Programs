import java.util.Scanner;

public class FToC{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the temperature in Fahrenheit: ");
      double fahrenheit = sc.nextDouble();
      double celsius = (5.0/9) * (fahrenheit - 32);
      System.out.println(fahrenheit + " degrees Fahrenheit is " + celsius + " degrees Celsius.");
   }
}