package aware;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springFirst.HelloSpring;

public class MyAwareTest {
	@Test
	public void testSayHello(){
		 ApplicationContext apc = new ClassPathXmlApplicationContext("HelloSpring.xml");  
	     System.out.println(apc.getBean("myAware").hashCode());  
		 
	}
}
