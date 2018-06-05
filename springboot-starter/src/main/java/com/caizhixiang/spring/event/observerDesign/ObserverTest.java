package com.caizhixiang.spring.event.observerDesign;

/**
 * 观察者模式测试类
 */
public class ObserverTest {
    public static void main(String[] args) {
        WechatObserverable wechatObserverable =new WechatObserverable();
        Observer xiaoMing=new User("xiaoming");
        Observer xiaoZhang=new User("xiaozhang");
        Observer xiaoLi=new User("xiaoli");
        wechatObserverable.registerObserver(xiaoLi);
        wechatObserverable.registerObserver(xiaoMing);
        wechatObserverable.registerObserver(xiaoZhang);
        wechatObserverable.setInformation("好好学习！");

        wechatObserverable.removeObserver(xiaoLi);
        wechatObserverable.setInformation("天天向上");

    }
}
