package in.app.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = {"in.app"})
public class SpringRootConfig {

	@Bean
	public BasicDataSource getDataSource(){
		BasicDataSource ds =  new BasicDataSource();
		ds.setDriverClassName("com.mysql.jdbc.driver");
		ds.setUrl("jdbc:mysql://localhost:3306/conapp_ds");
		ds.setUsername("root");
		ds.setPassword("root");
		ds.setMaxTotal(2);
		ds.setInitialSize(1);
		ds.setTestOnBorrow(true);
		ds.setValidationQuery("SELECT 1");
		ds.setDefaultAutoCommit(true);
		return ds;
	}
	//TODO - Services, DAO, Data SOurce, Email Sender, other business beans

}
