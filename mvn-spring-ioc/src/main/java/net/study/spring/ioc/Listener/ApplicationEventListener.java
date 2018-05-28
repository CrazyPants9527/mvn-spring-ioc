package net.study.spring.ioc.Listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

public class ApplicationEventListener implements ApplicationListener{

	public void onApplicationEvent(ApplicationEvent event) {
		// TODO Auto-generated method stub
		 // 如果是容器刷新事件
		if(event instanceof ContextRefreshedEvent){
			System.out.println("ContextRefreshedEvent  启动事件被触发了...");
		}
		if(event instanceof ContextStartedEvent){
			System.out.println("ContextStartedEvent  开始事件被触发了...");
		}
		if(event instanceof ContextStoppedEvent){
			System.out.println("ContextStoppedEvent  停止事件触发了...");
		}
		if(event instanceof ContextClosedEvent){
			System.out.println("ContextClosedEvent 关闭事件被触发了...");
		}
	}

	
}
