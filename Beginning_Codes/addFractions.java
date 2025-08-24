import java.util.Scanner;

public class addFractions{
    //Complete the program here, making sure your output matches the examples.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first numerator: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the first denominator: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the second numerator: ");
        int num3 = sc.nextInt();
        System.out.print("Enter the second denominator: ");
        int num4 = sc.nextInt();
        
        int num5 = (num1 * num4) + (num2 * num3);
        int num6 = (num4 * num2);
        System.out.print("The sum of " + num1 + "/" + num2 + " + " + num3 + "/" + num4 + " = " + num5 + "/" + num6);
    }
}