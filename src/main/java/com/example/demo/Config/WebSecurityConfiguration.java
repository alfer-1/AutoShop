package com.example.demo.Config;

import com.example.demo.Service.UserServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
    private UserServiceImplement userServise;

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){


        return new BCryptPasswordEncoder();
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().
                disable().
                authorizeRequests().
                antMatchers("/registration").
                not().
                fullyAuthenticated().
                antMatchers("/registration").
                hasRole("USER").
                antMatchers("/registration").
                permitAll().
                anyRequest().
                authenticated().
                and().
                formLogin().
                loginPage("/login").
                defaultSuccessUrl("/").
                permitAll().
                and().
                logout().
                permitAll().
                logoutSuccessUrl("/");


    }

    @Autowired

    protected void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.userDetailsService(userServise).passwordEncoder(bCryptPasswordEncoder());
    }
}
