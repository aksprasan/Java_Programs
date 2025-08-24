import java.util.Scanner;

public class sheepFeet{
    
    public static void main(String[] args){
        Scanner numSheep = new Scanner(System.in);
        System.out.print("How many sheep are on the farm: ");
        
        int sheep = numSheep.nextInt();
        
        int legs = 4*sheep;
        System.out.println("There are " + legs + " sheep feet on the farm!");
    }
}