package com.culture.Application;



import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import groovyjarjarpicocli.CommandLine;
import com.culture.Entity.Celebrite;
import com.culture.Entity.Departement;
import com.culture.Entity.Lieu;
import com.culture.Entity.Monument;
import com.culture.Repository.CelebriteRepository;
import com.culture.Repository.DepartementRepository;
import com.culture.Repository.LieuRepository;


@SpringBootApplication
@Transactional
public class Application implements CommandLineRunner {
	@Autowired
	private MonumentRepository monumentRepository;
	@Autowired
	private CelebriteRepository celebriteRepository;
	@Autowired
	private DepartementRepository departementRepository;
	@Autowired
	private LieuRepository lieuRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		
	}
	
	public void run(String... args) throws Exception {
		
		// TODO Auto-generated method stub			
//		Lieu l = monumentRepository.save( new Monument("spfb05ty554b","HOTEL DUFFAU","PRIVE","HOTEL_PARTICULIER",3.87521667,43.6140222,new Lieu("34070","Montpellier",3.87521667,43.6140222,new Departement("34","Herault",null)), new ArrayList<Celebrite>())).getCodeLieu();
//		l.getDepartement().setLieu(l);
//		
//		monumentRepository.save(new Monument("spfb05ty554b","HOTEL DUFFAU","PRIVE","HOTEL_PARTICULIER",3.87521667,43.6140222,new Lieu("34172"), new ArrayList<Celebrite>()));
//		monumentRepository.save(new Monument("spfb070h0d5t","HOTEL DE MONTFERRIER","PRIVE","HOTEL_PARTICULIER",3.8782,43.6109278,new Lieu("34172"), new ArrayList<Celebrite>()));
//		monumentRepository.save(new Monument("spfb070hzm8g","HOTEL DE GRIFFY","PRIVE","HOTEL_PARTICULIER",3.87848611,43.611075,new Lieu("34172"), new ArrayList<Celebrite>()));
//		monumentRepository.save(new Monument("spfb070q3mv0","HOTEL ESTORC","PRIVE","HOTEL_PARTICULIER", 3.87857778 ,43.6113333,new Lieu("34172"), new ArrayList<Celebrite>()));
//		monumentRepository.save(new Monument("spfb070qgp2u","HOTEL DE LA SOCIETE ROYALE DES SCIENCES","PRIVE","HOTEL_PARTICULIER",3.87864722,43.6114278,new Lieu("34172"), new ArrayList<Celebrite>()));
//		

		
		
	}
	
	
	

}
