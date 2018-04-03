package soundsystem;

import java.util.Random;

public class Dice {
    
    private int face;
    private Random random;
    
    public Dice(int face) {
        System.out.println("Dice 생성자");
        this.face = face;
        this.random = new Random();
    }
    
    public int getNumber() {
        return random.nextInt(face) + 1;
    }
    
}
