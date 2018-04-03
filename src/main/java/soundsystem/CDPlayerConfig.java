package soundsystem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 스프링 설정 클래스 어노테이션
public class CDPlayerConfig {
  
  @Bean
  public CDPlayer cdPlayer(CompactDisc compactDisc) {
    System.out.println("cdPlayer() 호출!!!!!");
    return new CDPlayer(compactDisc);
  }
  
  // 빈 생성 어노테이션. 기본값으로 메서드 이름을 빈 이름으로 등록한다.
  @Bean
  public CompactDisc compactDisc() {
    System.out.println("compactDisc() 호출!!!!");
    return new SgtPeppers();
  }
  
  @Bean
  public CompactDisc compactDisc2() {
    System.out.println("compactDisc2() 호출!!!!");
    return new MyDisc();
  }

}
