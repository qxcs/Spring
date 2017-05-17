package annotation_Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class People {

	@Bean(name="smart",initMethod="init",destroyMethod="destroy")
	//name指定了IOC容器中这个返回值的id，也就是一个smartphone对象
	//后面这两个方法应该在实现类里面
	public PhoneInterface getSmartPhone(){
		return new SmartPhone();
	}
	
}
