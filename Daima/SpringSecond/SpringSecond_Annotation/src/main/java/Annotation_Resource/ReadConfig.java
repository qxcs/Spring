package Annotation_Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:resources.xml")
public class ReadConfig {
	@Value("${jdbc.url}")
	String url;
	
	@Value("${jdbc.password}")
	String password;
	
	@Value("${jdbc.name}")
	String name;
	
	@Bean(name="jdbcManager")
	public JDBCManager getJDBCManager(){
		return new JDBCManager(url, name, password);
		//return new JDBCManager("url", "name", "password");
	}
	
}
