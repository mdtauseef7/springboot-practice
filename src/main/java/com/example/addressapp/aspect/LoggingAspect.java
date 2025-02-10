package com.example.addressapp.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
public class LoggingAspect {

    @Before("execution(* com.example.addressapp.service.AddressService.findAddressByEmployeeId(..))")
    public  void log(){
         System.out.println("Before findAddressByEmployeeId this will get called ");
    }

    @After("execution(* com.example.addressapp.service.AddressService.findAddressByEmployeeId(..))")
    public  void log1(){
        System.out.println("After findAddressByEmployeeId this will get called ");
    }

    @Around("execution(* com.example.addressapp.service.AddressService.findAddressByEmployeeId(..))")
    public  Object log2(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Before Around findAddressByEmployeeId this will get called ");
        Object proceed = joinPoint.proceed();
        System.out.println("After Around findAddressByEmployeeId this will get called ");
        return proceed;
    }

}
