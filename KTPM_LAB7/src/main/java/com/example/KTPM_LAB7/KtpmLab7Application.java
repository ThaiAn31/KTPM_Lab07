package com.example.KTPM_LAB7;


import com.example.KTPM_LAB7.dao.ChuyenBayDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@org.springframework.transaction.annotation.Transactional
public class KtpmLab7Application {

	public static void main(String[] args) {
		SpringApplication.run(KtpmLab7Application.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();

	}
}
