package com.culture.Security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;




@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		PasswordEncoder passwordEncoder=passwordEncoder();
		
		String encodedPWD=passwordEncoder().encode("1234");
		auth.inMemoryAuthentication().withUser("user").password(encodedPWD).roles("USER");
		auth.inMemoryAuthentication().withUser("admin").password(encodedPWD).roles("USER","ADMIN");
		

	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		
		http.logout()
	    .logoutUrl("/logout");
		http.logout()
	    .logoutSuccessUrl("/");
		
		http.formLogin();
		http.authorizeRequests().antMatchers("/doLogout").permitAll();
		http.authorizeRequests().antMatchers("/").permitAll();
		http.authorizeRequests().antMatchers("/webjars/**").permitAll();
		http.authorizeRequests().antMatchers("/css/**").permitAll();
		http.authorizeRequests().antMatchers("/media/**").permitAll();
		http.authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN");
		http.authorizeRequests().antMatchers("/user/**").hasRole("USER");
		http.authorizeRequests().anyRequest().authenticated();
		http.exceptionHandling().accessDeniedPage("/403");
	
	}
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
		
	}
	
	

}
