package net.study.spring.ioc.test.day2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataSourceTest {

	private ClassPathXmlApplicationContext con;
	@Before
	public void init() {
		con = new ClassPathXmlApplicationContext("spring-ioc-datasource.xml");
	}
	@Test
	public void selecttest(){
		BasicDataSource basic=(BasicDataSource) con.getBean("dataSource");
		try {
			Connection connection= basic.getConnection();
			System.out.println("连接对象："+connection);
			Statement stmt= connection.createStatement();
			String sql="SELECT * FROM teacher a,student b WHERE a.t_id=b.t_id AND a.t_id=2;";
			ResultSet rs= stmt.executeQuery(sql);
			while (rs.next()) {
				int tId=rs.getInt("t_id");
				int sId=rs.getInt("s_id");
				String tName = rs.getString("t_name");
				String sName = rs.getString("s_name");
				System.out.println("教师的姓名是："+tName+"--教师的Id是："+tId+"--他的学生姓名有："+sName+"--相对应的学生id是:"+sId);
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据源连接失败");
		}
		con.close();
	}
}
