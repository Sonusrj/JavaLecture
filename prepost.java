public class prepost {
    public static void main(String[] args) {
        int num =4;
        
        int post = num++; //fetch the value and then increment
        System.out.println("this is post inc "+post);

        int pre = ++num;// increment and then fetch the value
        System.out.println("this is pre inc "+pre);
    }
    
}
