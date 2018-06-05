package com.caizhixiang.spring.event.observerDesign;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者实现类：微信公众号
 */
public class WechatObserverable implements Observerable {
    private List<Observer> list;
    private String message;

    public WechatObserverable() {
        this.list = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (!CollectionUtils.isEmpty(list))
            list.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o:list) {
            o.update(message);
        }
    }

    public  void  setInformation(String msg){
        this.message=msg;
        System.out.println("微信服务更新信息："+msg);
        notifyObserver();
    }
}
