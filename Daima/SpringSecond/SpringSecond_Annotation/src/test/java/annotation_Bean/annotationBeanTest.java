package annotation_Bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotationBeanTest {
	@Test
	public void testAnnotationBean(){
		ApplicationContext apc=new ClassPathXmlApplicationContext("spring.xml");
		PhoneInterface phone=(PhoneInterface) apc.getBean("smart");
		System.out.println(phone.getClass().getName());
	}
}
