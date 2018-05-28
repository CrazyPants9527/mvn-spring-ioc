package net.study.spring.ioc.bean;

public class Live {
	
	public void Live(){
		System.out.println("这是一个构造方法");
	}
	public void initMethod(){
		System.out.println("初始化。。。。。。。");
	}
	public void destroyMethod(){
		System.out.println("消亡了。。。。。。。");
	}
	public void say(){
		System.out.println("我正在活着。。。。。");
	}
}
