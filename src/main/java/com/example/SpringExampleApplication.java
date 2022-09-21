package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Failed to determine a suitable driver class
// SpringExampleApplication.java에서 클래스명 위에 어노테이션 추가(디비 연동전에 임시로 넣는 코드)

// @ComponentScan(basePackages = "com")	com 밑에 있는 모든것을 찾아낸다.지금은안씀.

@SpringBootApplication
public class SpringExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringExampleApplication.class, args);
	}

	// SessionFactory 라는 bean을 spring bean으로 만든다.
	

}
