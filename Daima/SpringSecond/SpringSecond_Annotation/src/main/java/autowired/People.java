package autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class People {
	@Autowired // 可以在属性这里使用
	MicoPhone phone;

	/*
	 * @Autowired //也可以在set这里使用 public void setPhone(MicowavePhone phone) {
	 * this.phone = phone; }
	 * 
	 * @Autowired //也可以在构造方法这里使用 public People(MicowavePhone phone) { this.phone
	 * = phone; }
	 */

	public void speak(String word) {
		phone.say(word);
	}

}
