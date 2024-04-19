import java.util.HashMap;
import java.util.Map;

public class maps {
    public static void main (String a[])
    {

        Map<String,Integer> student = new HashMap<>();
        //Map<String,Integer> student = new Hashtable<>(); synchronized

        student.put("sonu", 11);
        student.put("seenu", 12);
        student.put("jon", 13);
        student.put("jim", 14);
        student.put("sonu", 21);//keys are unique

        System.out.println(student);
        System.out.println(student.get("seenu")); // returns value
        System.out.println(student.keySet());

        for(String key  : student.keySet())
        {
            System.out.println(key + " : "+ student.get(key));
        }





    }


    
}
