package soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Comparator;

public class SpringExam01 {
    
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
    
        CompactDisc compactDisc1 = context.getBean("compactDisc", CompactDisc.class);
        CompactDisc compactDisc2 = context.getBean("compactDisc", CompactDisc.class);
    
        System.out.println("compactDisc1 == compactDisc2 : " + (compactDisc1 == compactDisc2));
    
        CompactDisc myDisc = context.getBean("myDisc", CompactDisc.class);
        myDisc.play();
        
        CDPlayer cdPlayer = context.getBean(CDPlayer.class);
        cdPlayer.play();
        
    }
    
}
