import java.util.Scanner;
public class casting{
    
    public static void main(String[] args){
        /*
        Converting between two types (int to double) is done by casting
        
        The Cast operator is (int) or (double)
        Put that in front of whatever you're trying to convert
        */
        System.out.println(4);//4
        System.out.println((double) 4);//4.0
        System.out.println(4.5);//4.5
        System.out.println((int) 4.5);//4
        //When you cast a double to an int, the decimal portion is cut
        //Does not round
        System.out.println(1/3);//0
        System.out.println((double) 1/3);//0.3333
        System.out.println((double)(1/3));//0.0
        System.out.println((int) 3.0/4);//0
        /*
        Java stores ints in a 32 bit structure
            - Means they have 2^32 possible values
            - Max in 2.1 billion
            - Min is -2,1 billion
            - These are stored as Interger.MAX_VALUE and Integer.MIN_VALUE
        */
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + Integer.MAX_VALUE);
        
        //Doubles use a 64 bit structure
        //Max value for a double is around 2^53
        
        //Rounding
        //Several ways, but 1 way with casting
        double myNum = 4.77;
        int roundNum = (int) myNum;
        //If casted this will cut the decimal off
        System.out.println(roundNum);
        
        //Not Right
        int roundedNum = (int) (myNum + 0.5);
        System.out.println(roundedNum); //5
        
        Scanner grade = new Scanner(System.in);
        System.out.print("Grade? ");
        
        int G1 = grade.nextInt();
        System.out.print("Grade? ");
        int G2 = grade.nextInt();
        System.out.print("Grade? ");
        int G3 = grade.nextInt();
        double average = (G2 + G1 + G3)/3.0;
        System.out.print("The average is " + average);
    }
}