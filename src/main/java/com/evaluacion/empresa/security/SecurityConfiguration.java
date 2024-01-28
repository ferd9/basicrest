package com.evaluacion.empresa.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                . authorizeHttpRequests(auth -> {
	                		auth.requestMatchers(AntPathRequestMatcher.antMatcher("/h2-consola/**")).permitAll();
	                        auth.anyRequest().authenticated();	                        
                         
                        }                       
                )
                .headers(headers -> headers.frameOptions().disable())  
                .csrf().disable()
                //.csrf(csrf -> csrf
                       // .ignoringRequestMatchers(AntPathRequestMatcher.antMatcher("/h2-ui/**")))
                .httpBasic();
        return http.build();
    }
}
