package net.study.spring.ioc.test.day2;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.study.spring.ioc.annotation.dao.ProductDao;
import net.study.spring.ioc.annotation.service.ProductService;

public class ProductTest {

	private ClassPathXmlApplicationContext con;
	@Before
	public void init() {
		// TODO Auto-generated method stub

		con=new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
	}
	
	@Test
	public void test(){
		ProductDao product=(ProductDao) con.getBean("productDao");
		product.creatproduct("全新产品");
		con.close();
	}
	
	
	@Test
	public void test2(){
		ProductService product=(ProductService) con.getBean("ProductService");
		product.save("面包");
		con.close();
	} 
	
	
	
}
