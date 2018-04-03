package soundsystem;

import java.util.List;

public class Game {

    private List<Player> list;
    
    public Game() {
        System.out.println("Game 생성자");
    }
    
    public void setPlayerList(List<Player> list) {
        System.out.println("Game.setPlayerList");
        this.list = list;
    }
    
    public void play() {
        list.forEach(Player::play);
    }

}
