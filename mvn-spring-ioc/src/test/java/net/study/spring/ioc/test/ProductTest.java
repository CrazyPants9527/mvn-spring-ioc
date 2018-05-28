package net.study.spring.ioc.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.study.spring.ioc.bean.Product;

public class ProductTest {

	@Test
	public void test(){
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("spring-ioc.xml");
		Product product=(Product) con.getBean("creatproductid");
		System.out.println(product);
	}
}
