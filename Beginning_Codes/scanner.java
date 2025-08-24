import java.util.Scanner;
//import above class header

public class Input{
    public static void main(String[] args){
        //to input from the user, use a Scanner
        /*
            1) Add import statement
            2) Create a new Scanner object
        */
        Scanner sc = new Scanner(System.in);
        
        //3) Prompt the user
        System.out.print("How old are you: ");
        
        //4) Save what their input
        
        int age = sc.nextInt();
        
        //for doubles: nextDouble()
        //for String: nextLine() or next()
        
        System.out.println("Next year you will be " + (age + 1) + " years old!");
    }
}