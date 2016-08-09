/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinetoolstore.core.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author main
 */

//@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    
//    @Autowired
//    @Qualifier("userDetailService")
//    UserDetailsService userDetailsService;
//    
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(this.userDetailsService);
//    }
//    
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/", "/index", "/machine", "/machines").permitAll()
//                .antMatchers("/admin").access("hasRole('ADMIN') OR hasRole('DBA')")
//                .and()
//                .formLogin().loginPage("/login").defaultSuccessUrl("/index").failureUrl("/index?error")
//                .usernameParameter("ssoId").passwordParameter("password")
//                .and().csrf();
//    }
}
