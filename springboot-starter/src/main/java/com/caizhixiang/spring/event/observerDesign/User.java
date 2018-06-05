package com.caizhixiang.spring.event.observerDesign;

/**
 * 观察者实现类：用户
 */
public class User implements Observer {
    public  String name;
    public  String message;

    public  User(String name){
        this.name=name;
    }

    @Override
    public void update(String message) {
        this.message=message;
        read();
    }

    private void read() {
        System.out.println(name+"接收到信息；"+message);
    }
}
