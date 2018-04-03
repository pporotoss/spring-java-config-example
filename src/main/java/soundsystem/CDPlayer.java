package soundsystem;

public class CDPlayer implements MediaPlayer {
  private CompactDisc cd;

  public CDPlayer(CompactDisc cd) {
    System.out.println("CDPlayer 생성자 호출!!!");
    this.cd = cd;
  }
  
  public CompactDisc getCompactDisc() {
    return this.cd;
  }

  public void play() {
    cd.play();
  }

}
