package com.vnk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class MangeConfig {
  
	@Bean
	SecurityFilterChain getrequst(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((request)->request.requestMatchers("/register").permitAll().requestMatchers("/","/register","/login").authenticated())
		.formLogin(Customizer.withDefaults());
	return http.build();
	}    
 
	@Bean 
	public UserDetailsService userPassword() {
		UserDetails s=User.withDefaultPasswordEncoder().username("MANI").password("98765").build();
		UserDetails s1=User.withDefaultPasswordEncoder().username("Penchal").password("54321").build();
		return new InMemoryUserDetailsManager (s,s1);
	}
}
