package com.great.annotation;

import java.lang.annotation.*;

//自定义方法注解
//元注解-说明该注解将被包含在javadoc中
@Documented
//元注解-注解的作用目标
@Target({ElementType.METHOD,ElementType.TYPE})
//元注解-注解的生命周期。保存在class中，加载后仍然存在
@Retention(RetentionPolicy.RUNTIME)
public @interface MyRequestMapping
{
	String value() default "";
}
