package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class GameConfig {
    
    @Bean
    public Dice dice() {
        return new Dice(6);
    }
    
    @Bean
    public Player player1() {
        Player player = new Player();
        player.setDice(dice());
        player.setName("player1");
        return player;
    }
    
    @Bean
    public Player player2() {
        Player player = new Player();
        player.setDice(dice());
        player.setName("player2");
        return player;
    }
    
    @Bean
    public Player player3() {
        Player player = new Player();
        player.setDice(dice());
        player.setName("player3");
        return player;
    }
    
    @Bean
    public List<Player> dicePlayers(Dice dice) {
        List<Player> dicePlayers = new ArrayList<>();
        
        Player player1 = new Player();
        player1.setDice(dice);
        player1.setName("player1");
        dicePlayers.add(player1);
        
        Player player2 = new Player();
        player2.setDice(dice);
        player2.setName("player2");
        dicePlayers.add(player2);
        
        Player player3 = new Player();
        player3.setDice(dice);
        player3.setName("player3");
        dicePlayers.add(player3);
        
        return dicePlayers;
    }
    
    @Bean
    public List<Player> playerList() {
        List<Player> playerList = new ArrayList<>();
        playerList.add(player1());
        playerList.add(player2());
        playerList.add(player3());
        return playerList;
    }
    
    @Bean
    public Game game() {
        Game game = new Game();
        
        game.setPlayerList(playerList());
        
        return game;
    }
    
}
