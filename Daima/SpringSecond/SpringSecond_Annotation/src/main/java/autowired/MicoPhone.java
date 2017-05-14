package autowired;

import org.springframework.stereotype.Component;

@Component
public class MicoPhone {

	public void say(String word){
		System.out.println(word);
	}
}
