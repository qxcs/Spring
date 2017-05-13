package springFirst;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringImplTest {
	@Test
	public void testSayHello(){
		 ApplicationContext apc = new ClassPathXmlApplicationContext("HelloSpring.xml");  
	        HelloSpring hello = (HelloSpring) apc.getBean("helloWorld");  
	        System.out.println(hello.sayHello());  
	}
}
