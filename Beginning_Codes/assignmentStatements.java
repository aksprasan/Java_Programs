
public class assignmentStatements {
    public static void main(String[] args) {
        int score = 10;
        int bonus = score * 3;
        /* score * 3 is an expression
            - this is evaluated first
            - result gets assinged to bonus
        */
        System.out.println(score);
        System.out.println(bonus);
        // We assign a value to a variable using "="
        int x = 0;
        int y = 1;
        int z = 2;
        x = y; //x is now 1
        y = y * 2; // y is now 2
        z = 3; // z in now 3
        
        System.out.println("x: " + x + "\ny: " + y + "\nz: " + z);
        
        
        
        
        //What are the values of x, y, and z after this segment runs?
        //How can you check your answer?


        //Determine the value of each of the following after this segment runs
        //Swapping two values
        
        int varA = 10;
        int varB = 20;
        int temp = varA;
        varA = varB;
        varB = temp;
        
        /*
        Assinging values and data types
            * Becareful with your data type
            * Is fine to put an int onto a double
                - Java adds the .0 to the end of the whole number
            * NOT OK to put a double into an int
                -Java doesn't know what to do with the decimal
        */
        
        int num = 8;
        double dNum = num;
        System.out.println(dNum);
        
        //IMPORTANT: an expression that has atleast one double will resule in a double
        
        int a = 5;
        int b = a / 2;
        double c = a / 2.0;
        double d = a / b * c - 2;
        
    }
}