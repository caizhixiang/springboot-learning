package com.caizhixiang.spring.proxy;

/**
 * 目标对象
 * 
 * @author Administrator
 *
 */
public class UserDao implements IUserDao {

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("————保存成功————");
	}

}
