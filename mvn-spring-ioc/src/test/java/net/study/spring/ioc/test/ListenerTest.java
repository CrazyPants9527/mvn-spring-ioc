package net.study.spring.ioc.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListenerTest {

	private ClassPathXmlApplicationContext con;
	@Before
	public void init() {
		// TODO Auto-generated method stub
		con = new ClassPathXmlApplicationContext("spring-ioc-listener.xml");
	}
	@Test
	public void test(){
		con.stop();
//		con.refresh();
		con.start();
		con.close();
	}
}
