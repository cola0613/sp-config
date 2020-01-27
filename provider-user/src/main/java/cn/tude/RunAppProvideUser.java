package cn.tude;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //Eureka客户端
public class RunAppProvideUser {

	public static void main(String[] args) {
		SpringApplication.run(RunAppProvideUser.class, args);
	}
	
}
