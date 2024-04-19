
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String a[]){

    Set<Integer> nums =  new  HashSet<Integer>(); // removes duplicate values, with no sorted values and without index
    //Set<Integer> nums =  new TreeSet <Integer>(); //sorted according to the natural ordering of its elements
    nums.add(5);
    nums.add(40);
    nums.add(93);
    nums.add(20);
    nums.add(5);
    nums.add(1);

    System.out.println(nums);

    for(int n : nums)
    {
        System.out.println(n);
    }
    }
}
