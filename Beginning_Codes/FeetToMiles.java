import java.util.Scanner;

public class FeetToMiles{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of feet: ");
        int num = sc.nextInt();
        int miles = num/feetToMile;
        int feet = num % feetToMile;
        System.out.println(num + " feet = " + miles + " mile(s) and " + feet + " feet");
    }
}