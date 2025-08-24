public class operations{
    
    public static void main(String[] args){
        /*
        Compound Assignment Operators
            - Operators that both change the value and assigns it
            
        */
        int x = 0;
        x = x + 1;
        
        x += 3;
        x-=2;
        int y = 4;
        y /= 2;
        y*= 2;
        y%= 3;
        System.out.println(x + y);
        
        y--;
        x++;
        System.out.println(x);
        System.out.println(y);
        
        //x++ and x-- are not on the exam
        //Also ++x
        
    }
}