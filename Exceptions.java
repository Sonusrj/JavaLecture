public class Exceptions {
    public static void main(String a[]){
        // int i = 0; // normal statement
        // int j = 8/i; //  critical statement
        // System.out.println(j); //ArithmeticException: / by zero 


        int s = 0;
        int num[] = new int[5];
        try{
            System.out.println(num[1]);
            System.out.println(num[5]);
        }
        catch(Exception e)
        {
            System.out.println("wrong index -->>"+ e);
        }
        try
        {
             int r = 18/s;
        }
        catch (ArithmeticException e )
        {
            System.out.println("something went wrong "+ e);
        }
        System.out.println(s);
        System.out.println("bye");
    }
    
}
