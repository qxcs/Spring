package getResource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import autoWiring.MyService;

public class GetResourceTest {
	@Test
	public void testMyService() {
		 ApplicationContext apc = new ClassPathXmlApplicationContext("HelloSpring.xml");
		MyResource myResource=(MyResource) apc.getBean("myResource");
		myResource.getResource();
	}
}
