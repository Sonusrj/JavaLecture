public class Pattern {
    public static void main(String[] args){

        pattern2(4);

    }
    
    static void pattern1(int n){
        for(int row=1; row<=n; row++){
            // for every row ,run col
            for(int col =1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }

    static void pattern2(int n){
        for(int row =1;row<=n;row ++){
            for(int col=1; col<=n; col++){
                System.out.print("* ");
             }
            System.out.println();
        }


    }
}
