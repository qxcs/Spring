package mutiAutowired;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class People {

	@Autowired
	@Qualifier("smartPhone") //规定只装配smartphone，microphone不装配
	Set<PhoneInterface> phones;

	public void say() {
		if(phones!=null&&phones.size()!=0){
			for (PhoneInterface phone : phones) {
				System.out.println(phone+","+phone.getClass().getName());
			}
		}else{
			System.out.println("phones is null!!!!!");
		}
	}
}
