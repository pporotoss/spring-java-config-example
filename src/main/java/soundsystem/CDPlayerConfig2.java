package soundsystem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig2 {
  
  
  @Bean
  public CDPlayer cdPlayer() {
    System.out.println("---------------------------------------");
    System.out.println("className : "+this.getClass().getName());
    System.out.println("cdPlayer() 호출!!!!!");
    System.out.println("---------------------------------------");
    return new CDPlayer(myDisc());
    // Bean을 생성하는 메서드를 두번이상 호출시에는 이미 생성된 인스턴스를 리턴한다.
    // 왜냐하면, 스프링이 설정클래스를 읽어들이면서 설정클래스에 대한 프록시 객체를 생성후, 프록시 객체를 호출하기 때문이다.
  }
  
  @Bean
  public CompactDisc compactDisc() {
    System.out.println("compactDisc() 호출!!!!");
    return new SgtPeppers();
  }
  
  @Bean
  public CompactDisc myDisc() {
    System.out.println("myDisc() 호출!!!!");
    return new MyDisc();
  }

}
