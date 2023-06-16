package comwelcomeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WelcomeserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WelcomeserviceApplication.class, args);
	}

}
