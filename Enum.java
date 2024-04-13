// special data type which consist of predefined constants

enum Status{
    Running, Failed, Pending, Success;
}


public class Enum {
    public static void main(String[] args) {
        Status s = Status.Success;
    
    if( s== Status.Running)
        System.out.println("all good");
    else if ( s == Status.Failed)
        System.out.println("failed try agin");
    else if ( s == Status.Pending)
        System.out.println("please wait and  try agin");
    else 
        System.out.println("done");


    }

}
