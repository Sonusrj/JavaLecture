class A 
{
    public void show()
    {
        System.out.println("in A show");
    }
}
class B extends A
{
    public void show1()
    {
        System.out.println("in B show");
    }
}
public class Casting {
    public static void main(String[] args) {
        // double d = 5.5;
        // int i = (int) d;
        // System.out.println(i);  type casting

        A obj = (A) new B();
        obj.show();

        B obj1 = (B) obj;
        obj1.show1();
    }
    
}
