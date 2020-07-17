package cn.wfc.driveexam.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/toLogin").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/toLogin")
                .successForwardUrl("/index")
                .permitAll()
                .and()
                .logout()
                .and()
                .csrf().disable();
    }
}
