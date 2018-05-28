package net.study.spring.ioc.bean;

public class Hello {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	

	public String sayHello(){
		return "hello"+name;
	}
	
	
}
