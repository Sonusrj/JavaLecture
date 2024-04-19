import java.util.ArrayList;
import java.util.Collection;

public class Arrlist {
    public static void main(String a[]){

    Collection<Integer> nums =  new ArrayList<Integer>();
    //List<Integer> nums =  new ArrayList<Integer>(); this also help in indexing
    nums.add(5);
    nums.add(4);
    nums.add(3);
    nums.add(2);

    System.out.println(nums);

    for(int n : nums)
    {
        System.out.println(n);
    }
    }
}
