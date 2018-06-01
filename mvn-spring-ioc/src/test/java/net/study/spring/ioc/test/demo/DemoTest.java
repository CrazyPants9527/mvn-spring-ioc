package net.study.spring.ioc.test.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.study.spring.ioc.annotation.demo.Admin;
import net.study.spring.ioc.annotation.demo.AdminInterface;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-ioc-demo.xml" })
public class DemoTest {

//	@Autowired
//	private AdminInterface inter;
	
	@Autowired
	private Admin admin;	
	@Test
	public void test(){
		
		System.out.println(admin);
	}
}
