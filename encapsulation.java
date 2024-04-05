class Human
{


    public Human(){
        System.out.println("Inside a contstructor");
        age = 122;
        name = "jon";
    }

    private int age = 11;
    private String name = "Sonu";

    public int getAge()
        {
            return age;
        }
    public String getName()
    {
        return name;
    }

    public void setAge(int a){
        age = a;
    }
    
}



public class encapsulation {
    public static void main(String a[])
    {
        Human obj = new Human();
        System.out.println(obj.getAge());
        System.out.println(obj.getName());

        obj.setAge(21);
        System.out.println(obj.getAge());
    }
}
