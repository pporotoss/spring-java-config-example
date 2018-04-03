package soundsystem;

public class Player {
    
    private Dice dice;
    private String name;
    
    public Player() {
        System.out.println("Player 생성자");
    }
    
    public void setName(String name) {
        System.out.println("Player.setName()");
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setDice(Dice dice) {
        System.out.println("Player.setDice()");
        this.dice = dice;
    }
    
    public void play() {
        int randomNumber = dice.getNumber();
        System.out.println(getName()+"의 주사위 숫자가 "+randomNumber+"이 나왔습니다.");
    }

}
