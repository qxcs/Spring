package annotation;

import org.springframework.stereotype.Component;

@Component
public class MyAnnotation {

	public void sayHi(String word){
		System.out.println("MyAnnotation:"+word);
	}
	
}
