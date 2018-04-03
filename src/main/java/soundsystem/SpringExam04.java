package soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExam04 {
    
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig4.class);
        
        CompactDisc compactDisc1 = context.getBean(CompactDisc.class);
        CompactDisc compactDisc2 = context.getBean(CompactDisc.class);
    
        System.out.println("compactDisc1 == compactDisc2 : " + (compactDisc1 == compactDisc2));
    }
    
}
