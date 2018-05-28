package net.study.spring.ioc.annotation.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.study.spring.ioc.annotation.dao.ProductDao;

@Service("ProductService")
public class ProductService {

	@Autowired
	private ProductDao productdao;
	
	public void save(String product){
		productdao.creatproduct(product);
	}
}
