package autoWiring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringTest {
	@Test
	public void testMyService() {
		 ApplicationContext apc = new ClassPathXmlApplicationContext("HelloSpring.xml");
		 MyService myService=(MyService) apc.getBean("myService");
		 myService.sayHi("Hello AutoWiring");
	}
}
