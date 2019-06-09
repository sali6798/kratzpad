package com.kratzpad;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityJavaConfig extends WebSecurityConfigurerAdapter {



    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //super.configure(auth);
        auth.inMemoryAuthentication()
                //.withUser("guest").password("{noop}password").roles("USER")
                .withUser("guest").password(passwordEncoder().encode("password")).roles("USER")
                .and()
                .withUser("admin").password(passwordEncoder().encode("password")).roles("ADMIN")
                .and()
                .withUser("user").password(passwordEncoder().encode("password")).roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //super.configure(http);
        http
                .httpBasic()
                .and()
                .authorizeRequests()
                //.antMatchers("/").permitAll()
                .antMatchers(HttpMethod.GET, "/leaf").hasRole("USER")
                //.antMatchers(HttpMethod.GET, "/leaf/**").permitAll();
                .and()
                .csrf().disable()
                .formLogin().disable();

    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
