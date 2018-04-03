package soundsystem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 스프링 설정 클래스 어노테이션
public class CDPlayerConfig {
  
  @Bean// 주입받는 파라미터명은 빈 이름과 동일해야 한다.
  public CDPlayer cdPlayer(CompactDisc compactDisc) { // compactDisc 빈 주입
//  public CDPlayer cdPlayer(CompactDisc myDisc) { // myDisc 빈 주입
    
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
  public CompactDisc myDisc() {
    System.out.println("myDisc() 호출!!!!");
    return new MyDisc();
  }

}
