package com.example.aop.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
public class CustomInterceptor implements HandlerInterceptor {

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {
    // 컨트롤러 호출 전에 실행되는 메서드
    // 요청을 가로채고 추가 작업을 수행
    // true를 반환하면 다음 Interceptor 또는 컨트롤러로 요청이 전달되고, false를 반환하면 요청이 중단
    // Interceptor의 preHandle 메서드: 핸들러 실행 전에 호출
    // 예시: 로그인 체크, 권한 체크 등의 작업 수행
    log.info("요청을 가로챔 Interceptor");
    return true; // 계속 진행
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
      ModelAndView modelAndView) throws Exception {
    // 컨트롤러 호출 후, 뷰 렌더링 전에 실행되는 메서드
    // 컨트롤러의 처리 결과에 대한 후처리 작업을 수행
    // Interceptor의 postHandle 메서드: 핸들러 실행 후, View 렌더링 전에 호출
    // 예시: 모델 데이터 조작, 뷰 선택 등의 작업 수행
    log.info("포스트헨들러 실행 Interceptor");

  }

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
      Object handler,
      Exception ex) throws Exception {
    // Interceptor의 afterCompletion 메서드: View 렌더링 후 호출
    // 예시: 로깅, 자원 정리 등의 작업 수행
    log.info("후처리 Interceptor");
  }

}
