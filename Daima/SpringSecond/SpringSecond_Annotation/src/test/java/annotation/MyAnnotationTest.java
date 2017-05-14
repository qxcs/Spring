package annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyAnnotationTest {

	@Test
	public void testSayHi(){
		ApplicationContext apc=new ClassPathXmlApplicationContext("spring.xml");
		MyAnnotation ma=(MyAnnotation) apc.getBean("myAnnotation");
		ma.sayHi("this is a test");
	}
	
}
