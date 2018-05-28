package net.study.spring.ioc.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.study.spring.ioc.bean.User;

public class UserTest {

	@Test
	public void test1(){
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("spring-ioc.xml");
		User user=(User) con.getBean("conuser");
		System.out.println(user);
		con.close();
	}
	@Test
	public void test2(){
		ClassPathXmlApplicationContext con=new ClassPathXmlApplicationContext("spring-ioc.xml");
		User user=(User) con.getBean("setuser");
		System.out.println(user);
		con.close();
	}
}
