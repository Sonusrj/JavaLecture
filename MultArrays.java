public class MultArrays {
    public static void main(String a[])
    {
        int num[][] = new int[2][2];

        for (int i=0; i<2; i++)
        {
            for (int j=0; j<2; j++)
            {
                num[i][j] = (int)(Math.random()*100);
                System.out.print(num[i][j]+ " ");
            }
            System.out.println();
        }

        // Enhanced array
        for(int n[] : num)
        {
            for (int m : n)
            {
                System.out.print(m +" ");
            }
            System.out.println();
        } 
    }
    
}
