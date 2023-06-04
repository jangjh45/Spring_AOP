package com.example.aop.Filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomFilter1 implements Filter {

  @Override
  public void init(FilterConfig filterConfig) {
    // 필터의 초기화 작업을 수행하는 메서드입니다.
    log.info("필터1 생성");
  }

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {

    log.info("필터1 시작");
    chain.doFilter(request, response);
    log.info("필터1 종료");
  }

  @Override
  public void destroy() {
    // 필터의 종료 작업을 수행하는 메서드입니다.
    log.info("필터1 제거");
  }
}
