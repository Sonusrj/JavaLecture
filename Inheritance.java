class Calc
{
    public int add(int n1, int n2)
    {
        return n1+n2;
    }
    public int sub(int n1,int n2)
    {
        return n1-n2;
    }
}

class AdvCalc extends Calc
{
    public int mul(int n1, int n2)
    {
        return n1*n2;
    }

    public int div(int n1, int n2)
    {
        return n1/n2;
    }
}

class VeryAdvCalc extends AdvCalc
{
    public double power(int n1,int n2)
    {
        return Math.pow(n1,n2);
    }

}





public class Inheritance {
    public static void main(String arg[])
    {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(3,4);
        int r2 = obj.sub(2,3);
        int r3 = obj.mul(2,3);
        int r4 = obj.div(2,3);
        double r5 = obj.power(4, 2);


        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);

    }
    
}
