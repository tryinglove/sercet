package com.sercet.utils.aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by john on 2017/11/12.
 */
@Component
@Aspect
public class ServiceLogAOP {
    private final static Log logger = LogFactory.getLog(ServiceLogAOP.class);
    @Before("execution(* com.sercet.service.*.*(..))")
    public void before(JoinPoint joinpoint){
        Object[] a = joinpoint.getArgs();
        StringBuffer args = new StringBuffer("参数为:");
        for (int i = 0;i < a.length;i++){
            args = args.append(a[i].toString());
        }
        logger.info("进入"+joinpoint.getThis().getClass().getName().toString()+"执行"+joinpoint.getSignature().getName()+args.toString());
    }
    @After("execution(* com.sercet.service.*.*(..))")
    public void after(JoinPoint joinPoint){
        Object[] a = joinPoint.getArgs();
        StringBuffer args = new StringBuffer("输出");
        for (int i = 0;i < a.length;i++){
            args = args.append(a[i].toString());
        }
        logger.info(joinPoint.getThis().getClass().getName().toString()+"执行"+joinPoint.getSignature().getName()+args.toString());
    }

}
