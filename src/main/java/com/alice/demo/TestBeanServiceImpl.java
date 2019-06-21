package com.alice.demo;

/**
 * springIOC实例
 * @author 郝雨烁
 * @date 2019年6月21日20:27:45
 */

public class TestBeanServiceImpl implements TestBeanService {

    public String getBean() {
        return "a test bean";
    }
}
