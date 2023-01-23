package com.culture.Application;



import javax.transaction.Transactional;

import com.culture.Repository.MonumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.culture.Repository.CelebriteRepository;
import com.culture.Repository.DepartementRepository;
import com.culture.Repository.LieuRepository;


@SpringBootApplication


public class Application {



	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}



}
