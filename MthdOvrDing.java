
class A
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
class B extends A
{
    public void show() //over rides the above method
    {
        System.out.println("in B show");
    }

}

public class MthdOvrding {
    public static void main(String a[])
    {
        B obj = new B();
        obj.show();
        obj.config();
    }
    
}
