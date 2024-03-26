public class Methods {

    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(3);
        System.out.println(str);
    }
}

class Computer {

    public void playMusic() {
        System.out.println("Play music..");
    }

    public String getMeAPen(int cost) {
        if(cost>=10)
            return "pen";
        else
            return "Nothing";
    }
}
