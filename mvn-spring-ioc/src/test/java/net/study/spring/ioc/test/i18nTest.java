package net.study.spring.ioc.test;

import java.util.Locale;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;

public class i18nTest {

	private ClassPathXmlApplicationContext con;
	@Before
	public void init() {
		con = new ClassPathXmlApplicationContext("spring-ioc-i18n.xml");
	}
	@Test
	public void test(){
		ResourceBundleMessageSource re=(ResourceBundleMessageSource) con.getBean("messageSource");
		String str= re.getMessage("username",null,new Locale("en", "US"));
		System.out.println("信息:"+str);
		con.close();
	}
	@Test
	public void test2(){
		ResourceBundleMessageSource re=(ResourceBundleMessageSource) con.getBean("messageSource");
		String msg= re.getMessage("msg",new Object[]{"zhang3","yashi"},new Locale("en", "US"));
		System.out.println("英语信息:"+msg);
		
		String msg2= re.getMessage("msg",new Object[]{"张三","吃饭了吗"},new Locale("zh", "CN"));
		System.out.println("中文意思:"+msg2);
		con.close();
	}
}
