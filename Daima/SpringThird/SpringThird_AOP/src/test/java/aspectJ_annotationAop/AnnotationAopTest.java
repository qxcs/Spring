package aspectJ_annotationAop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAopTest {

	@Test
	public void testAnnotationAop(){
		ApplicationContext apc=new ClassPathXmlApplicationContext("spring.xml");
		Speech s =(Speech) apc.getBean("speech");
		s.speak();
	}
}
