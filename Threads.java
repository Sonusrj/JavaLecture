class A  implements Runnable
{
    public void run()
    {
        for (int i=1;i<=10;i++)
        {
            System.out.println("Hi");
        }
    }
}
class B implements Runnable
{
    public void run()
    {
        for (int i=1;i<=10;i++)
        {
            System.out.println("Hello");
        }
    }
}


public class Threads {
    public static void main(String a[])
    {
        A obj1 = new A();
        B obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);


        t1.start(); // 
        t2.start();

        // obj2.setPriority(Thread.MAX_PRIORITY); will set the priority to max        

    }
    
}

/*output

Hello
Hello
Hi
Hi
Hi
Hi
Hello
Hi
Hi
Hi
Hi
Hi
Hello
Hello
Hi
Hello
Hello
Hello
Hello
Hello
 */
