package annotation_Bean;

import org.springframework.stereotype.Component;

@Component
public class SmartPhone implements PhoneInterface{
	public void init(){
		System.out.println("this is a init method");
	}
	public void destroy(){
		System.out.println("this is a destroy method");
	}
	
}
