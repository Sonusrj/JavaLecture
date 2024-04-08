// Poly - many
// morphisim - behaviour
// two types = 1. compile time and 2. Run time

class  A 
{
    public void show()
    {
        System.out.println("in A show");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("in B show");
    }
}
class C extends A
{
    public void show()
    {
        System.out.println("in C show");
    }
}





public class Polymorphism {
    public static void main (String a[])
    {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
    
}
