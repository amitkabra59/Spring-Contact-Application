package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"src/java/resources"})
public class SpringRootConfig {

	//TODO - Services, DAO, Data SOurce, Email Sender, other business beans

}