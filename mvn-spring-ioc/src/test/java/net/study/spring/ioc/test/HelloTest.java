package net.study.spring.ioc.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.study.spring.ioc.bean.Hello;

public class HelloTest {

//	private ClassPathXmlApplicationContext con;
//	@Before
//	private void init() {
//		// TODO Auto-generated method stub
//
//		con=new ClassPathXmlApplicationContext("spring-ioc.xml");
//	}
	
	@Test
	public void hellotest(){
		ClassPathXmlApplicationContext con=new ClassPathXmlApplicationContext("spring-ioc.xml");
		Hello hello=(Hello) con.getBean("hello");
		System.out.println(hello.sayHello());
		con.close();
		
	}
	
}
