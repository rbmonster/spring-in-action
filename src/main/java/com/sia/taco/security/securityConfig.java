package com.sia.taco.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * <pre>
 * @Description:
 *  默认用户名：user
 *  密码随机生成
 * </pre>
 *
 * @version v1.0
 * @ClassName: secrityConfig
 * @Author: 86159
 * @Date: 2020/4/25 14:23
 */
public class securityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);

        // 自定义用户认证
//        auth.userDetailsService().passwordEncoder()
        //使用内存进行用户验证
//        auth.inMemoryAuthentication().withUser("buzz").password("123").authorities("ROLE_USER");
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }

    /**
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 请求拦截拼接
        http.authorizeRequests().antMatchers("/")
                // 请求权限拦截
                .hasRole("ROLE_USER").antMatchers("/", "***").permitAll()
                // 若通过拦截跳转指定登录页,登录成功跳转默认登录url
                .and().formLogin().loginPage("/login").defaultSuccessUrl("/defaultSuccess")
                // 退出登录默认调准啊页面
                .and().logout().logoutSuccessUrl("/");
        // 可选择是否禁用跨服务请求
//                .and().csrf().disable()

        super.configure(http);
    }
}
