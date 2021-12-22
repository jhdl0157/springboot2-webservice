package com.mbappe.book.springboot.config.auth;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER) //어노테이션이 쓸수 있는 위치 여기는 파라메터에만 쓸수 있게 타겟을 정해놈
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser {
}
