package net.study.spring.ioc.dao;

import javax.sql.DataSource;

public class UserDao {

	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public void save(String user){
		System.out.println("保存用户-----用户名："+user+"数据源对象:"+dataSource);
	}
}
