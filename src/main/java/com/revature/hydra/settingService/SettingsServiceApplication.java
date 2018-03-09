package com.revature.hydra.settingService;

import com.revature.hydra.settingService.config.SpringApplicationContextInitializer;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@EnableMongoRepositories(basePackages = "com.revature.hydra.settingService")
@SpringBootApplication(scanBasePackages = {"com.revature.hydra.settingService", "com.revature.assignforcecommon.security"},
		exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
//@EnableDiscoveryClient
@EntityScan("com.revature.beans")
public class SettingsServiceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		new SpringApplicationBuilder( SettingsServiceApplication.class).
			initializers( new SpringApplicationContextInitializer())
			.application()
			.run( args);

//		SpringApplication.run(SettingsServiceApplication.class, args);
	}
}
