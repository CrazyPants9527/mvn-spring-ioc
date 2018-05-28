package net.study.spring.ioc.annotation.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("productDao")
public class ProductDao {

	@Autowired
	private DataSource dataSource;
	
	@Value("李骏填")
	private String name;
	
	public void creatproduct(String product){
		System.out.println("产品人"+name+"------产品"+product+"保存成功"+dataSource);
	} 
}
