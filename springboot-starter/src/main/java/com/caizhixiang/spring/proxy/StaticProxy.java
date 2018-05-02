package com.caizhixiang.spring.proxy;

/**
 * 静态代理示例
 * 
 * @author Administrator
 * 静态代理总结:
 * 1.可以做到在不修改目标对象的功能前提下,对目标功能扩展.
 * 2.缺点:
 * 因为代理对象需要与目标对象实现一样的接口,所以会有很多代理类,类太多.同时,一旦接口增加方法,目标对象与代理对象都要维护.
 */
public class StaticProxy {
	private IUserDao userDao;
	public StaticProxy() {
		super();
	}
	public StaticProxy(IUserDao userDao) {
		super();
		this.userDao=userDao;
	}
	public void save(){
		System.out.println("开启事物");
		userDao.save();
		System.out.println("结束事物");
	}
	
	public static void main(String[] args) {
		UserDao target =new UserDao();
		//代理对象,把目标对象传给代理对象,建立代理关系
		StaticProxy staticProxy=new StaticProxy(target);
		staticProxy.save();
	}
}

