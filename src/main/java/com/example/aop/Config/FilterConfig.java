package com.example.aop.Config;

import com.example.aop.Filter.CustomFilter1;
import com.example.aop.Filter.CustomFilter2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

  @Bean
  public FilterRegistrationBean<CustomFilter1> customFilterRegistrationBean1() {
    FilterRegistrationBean<CustomFilter1> registrationBean = new FilterRegistrationBean<>();
    registrationBean.setFilter(new CustomFilter1());
    registrationBean.addUrlPatterns("/api/*"); // 선택 사항: URL 패턴 지정
    return registrationBean;
  }

  @Bean
  public FilterRegistrationBean<CustomFilter2> customFilterRegistrationBean2() {
    FilterRegistrationBean<CustomFilter2> registrationBean = new FilterRegistrationBean<>();
    registrationBean.setFilter(new CustomFilter2());
    registrationBean.addUrlPatterns("/api/*"); // 선택 사항: URL 패턴 지정
    return registrationBean;
  }

}
