import java.util.Scanner;

public class AreaAndPerimeter{
    public static void main(String[] args){
        //Complete the program here.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = sc.nextInt();
        System.out.print("Enter the width: ");
        int width = sc.nextInt();
        int area = length * width;
        int perimeter = (length * 2)+(width * 2);
        System.out.print("A " + length + " x " + width + " rectangle has an area of " + area + " square units and a perimeter of " + perimeter + " units." );
    }
}