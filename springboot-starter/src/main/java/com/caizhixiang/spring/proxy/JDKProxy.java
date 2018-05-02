package com.caizhixiang.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理——jdk
 * 
 * @author Administrator 代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理
 */
public class JDKProxy {
	private Object target;

	public JDKProxy(Object target) {
		this.target = target;
	}

	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// TODO Auto-generated method stub
						System.out.println("开启事物");
						Object invoke = method.invoke(target, args);
						System.out.println("提交事物");
						return invoke;
					}
				});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDao target = new UserDao();
		System.out.println("__" + target.getClass());
		JDKProxy jdkProxy = new JDKProxy(target);
		IUserDao proxyInstance = (IUserDao) jdkProxy.getProxyInstance();
		System.out.println("——" + proxyInstance.getClass());
		proxyInstance.save();
	}

}
