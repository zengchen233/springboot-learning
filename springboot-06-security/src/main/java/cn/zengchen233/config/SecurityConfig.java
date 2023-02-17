package cn.zengchen233.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author zengchen
 * @title SecurityConfig
 * @description
 * @create 2023/2/17
 */
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    //授权
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 首页所有人可以访问， 功能页只有对应有权限的人才能访问
        // 请求授权的规则~
        http.authorizeHttpRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/level1/**").hasRole("vip1")
                .antMatchers("/level2/**").hasRole("vip2")
                .antMatchers("/level3/**").hasRole("vip3");

        // 没有权限默认跳到登陆页面
        http.formLogin();
        http.logout().logoutSuccessUrl("/");
    }

    //认证
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("guest")
                .password("{noop}123").roles("vip1")
                .and()
                .withUser("zcc")
                .password("{noop}123").roles("vip2", "vip3")
                .and()
                .withUser("root")
                .password("{noop}123").roles("vip1", "vip2", "vip3");
    }
}
