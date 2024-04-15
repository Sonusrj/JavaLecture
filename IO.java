import java.util.Scanner;
import java.io.IOException;

public class IO {

    public static void main(String a[]) throws IOException {

        //System.out.println("Enter a number");
        //int num = System.in.read();

        // System.out.println(num);\ not a ideal way, return ASCII value


        // InputStreamReader in =new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);
        // bf.close();
        
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }
}
