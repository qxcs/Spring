package aspectJ_annotationAop;

import org.springframework.stereotype.Component;

@Component
public class Speech {

	public void speak(){
		System.out.println("this is a speech");
	}
}
