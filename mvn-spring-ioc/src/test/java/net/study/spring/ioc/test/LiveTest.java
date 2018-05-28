package net.study.spring.ioc.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.study.spring.ioc.bean.Live;

public class LiveTest {

//	private ClassPathXmlApplicationContext con;
//	@Before
//	private void init() {
//		// TODO Auto-generated method stub
//		 con = new ClassPathXmlApplicationContext("spring-ioc.xml");
//	}
	@Test
	public void livetset(){
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("spring-ioc.xml");
		Live live=(Live) con.getBean("livemethod");
		live.say();
		con.close();
	}
}
