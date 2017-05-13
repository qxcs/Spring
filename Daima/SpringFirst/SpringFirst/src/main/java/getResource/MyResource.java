package getResource;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

public class MyResource implements ApplicationContextAware{

	private ApplicationContext applicationContext;
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext=applicationContext;
	}
	
	public void getResource(){
		Resource resource=applicationContext.getResource("forResource.txt");
		System.out.println(resource.getFilename());
		try {
			System.out.println(resource.contentLength());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("长度异常");
			e.printStackTrace();
		}
	}

}
