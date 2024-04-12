// class - class -> 'extends'
// class - interface -> 'implements'
// interface - interface -> 'extends'

interface A
{

    int age=33;        //final and static
    String area="pune";

    void show();
    void config();
}

class B implements A
{
    public void show()
        {
            System.out.println("in show");
        }
    public void config()
    {
        System.out.println("in config");
    } 
}



public class Interface {
    public static void main(String[] args) {
        
    
    A obj=new B();
    obj.show();
    obj.config();
    }

    
}
