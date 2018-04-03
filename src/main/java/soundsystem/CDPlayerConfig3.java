package soundsystem;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig3 {
  
  // 파라미터 이름과 동일한 메서드가 존재하더라도, @Qualifier 어노테이션이 우선하여 적용된다.
  @Bean
  public CDPlayer cdPlayer(@Qualifier("myDisc") CompactDisc compactDisc) {
    System.out.println("---------------------------------------");
    System.out.println("className : "+this.getClass().getName());
    System.out.println("cdPlayer() 호출!!!!!");
    System.out.println("---------------------------------------");
    return new CDPlayer(compactDisc);
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
