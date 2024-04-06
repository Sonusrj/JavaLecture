class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand +" : "+ price +" : " + name);
    }
}


public class Statickeywrd {
    public static void main(String a[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "apple";
        obj1.price = 1999;
        obj1.name = "smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "samsung";
        obj2.price = 1999;
        obj2.name = "smartphone";

        // trying to change the name without static will result change in that object only
        // SO now its static so we should call it  by class name , although we use object but  ignore

        //obj1.name= "Phone";  using object
        Mobile.name = "Phone";

        obj1.show();
        obj2.show();

        

    }

    
}
