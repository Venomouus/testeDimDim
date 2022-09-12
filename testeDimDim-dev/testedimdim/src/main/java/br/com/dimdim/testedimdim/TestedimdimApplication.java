package br.com.dimdim.testedimdim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class TestedimdimApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestedimdimApplication.class, args);
	}

}
