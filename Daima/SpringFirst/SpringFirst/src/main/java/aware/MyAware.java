package aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyAware implements ApplicationContextAware,BeanNameAware{

	private String beanName;
	
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.beanName=name;
		System.out.println("name:"+this.beanName);
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("MyAware Application:"+applicationContext.getBean(beanName).hashCode());
	}

}
