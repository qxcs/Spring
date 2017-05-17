package Annotation_Resource;

import org.springframework.stereotype.Component;

@Component
public class JDBCManager {
	
	
	
	public JDBCManager() {
	}

	public JDBCManager(String url,String name,String password){
		System.out.println("url:"+url+"\nname:"+name+"\npassword:"+password);
	}
	
}
