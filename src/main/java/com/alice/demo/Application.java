package com.alice.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * springIOC实例
 * @author 郝雨烁
 * @date 2019年6月21日20:27:45
 */
public class Application {
    public static void main(String[] args) {
        // 加载xml配置
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:application.xml");

        // IOC获取Bean
        TestBeanService testBeanService = context.getBean(TestBeanService.class);

        System.out.println(testBeanService.getBean());
    }
}
