package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//(exclude= DataSourceAutoConfiguration.class)
@SpringBootApplication
public class DemoApplication {
     /*主分支修改1*/
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
