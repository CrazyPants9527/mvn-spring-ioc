package net.study.spring.ioc.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class User {

	private String name;
	private String password;
	private List<String> books;
	private Set<String> ha;
	private Map<String,String> fool;
	private Properties movie;
	
	public User() {
		super();
	}

	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	public List<String> getBooks() {
		return books;
	}

	public void setBooks(List<String> books) {
		this.books = books;
	}

	public Set<String> getHa() {
		return ha;
	}

	public void setHa(Set<String> ha) {
		this.ha = ha;
	}

	public Map<String, String> getFool() {
		return fool;
	}

	public void setFool(Map<String, String> fool) {
		this.fool = fool;
	}

	public Properties getMovie() {
		return movie;
	}

	public void setMovie(Properties movie) {
		this.movie = movie;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", books=" + books + ", ha=" + ha + ", fool=" + fool
				+ ", movie=" + movie + "]";
	}
	
	
}
