package com.example.aop.Config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class CustomAOP {

  @Pointcut("execution(* com.example.aop.Controller.*.*(..))")
  public void PointCut() {
  }

  @Before("PointCut()")
  public void Before(JoinPoint joinPoint) {
    log.info("AOP작동함?");
  }
}
