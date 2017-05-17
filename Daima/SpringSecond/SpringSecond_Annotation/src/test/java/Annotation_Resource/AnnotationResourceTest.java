package Annotation_Resource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationResourceTest {
	
	@Test
	public void TestAnnotationResource(){
		ApplicationContext apc=new ClassPathXmlApplicationContext("spring.xml");
		JDBCManager jdbcManager=(JDBCManager) apc.getBean("jdbcManager");
	}
}
