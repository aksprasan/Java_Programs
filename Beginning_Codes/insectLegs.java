import java.util.Scanner;

public class insectLegs{
     public static void main(String[] args){
          Scanner askInsects = new Scanner(System.in);
          System.out.print("How many insects? ");
          int bugs = askInsects.nextInt();
          int bugLegs = bugs * 6;
          System.out.println(bugs + " insects have " + bugLegs + " legs" );
     }
}