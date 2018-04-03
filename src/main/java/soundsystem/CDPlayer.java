package soundsystem;
import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {
  private CompactDisc cd;

  @Autowired
  public CDPlayer(CompactDisc cd) {
    System.out.println("CDPlayer 생성자 호출!!!");
    this.cd = cd;
  }

  public void play() {
    cd.play();
  }

}
