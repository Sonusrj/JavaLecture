
class Calculator
{
    public int add(int n1,int n2)
    {
       int r = n1 +n2;
        return r;
    }
}






public class ClassObj {
    public static void main(String args[])
    {
        int num1 = 2;
        int num2 = 4 ;
        // int result = num1+num2;
        

        Calculator cal = new Calculator();

        int result = cal.add(num1,num2);
        System.out.println(result);

    }
    
}
