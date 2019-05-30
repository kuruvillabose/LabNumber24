package com.grandCircus.springCoffeShop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CoffeeJdbcDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Items> findAllItems(){
		return jdbcTemplate.query("select * from items", new BeanPropertyRowMapper<Items>(Items.class));
	}
	public int addUser(String firstname, String lastname,String email,int phonenumber, String password) {
		String addQuery = "insert into Users(firstname, lastname,email,phonenumber,password) values(?,?,?,?,?)";
		return jdbcTemplate.update(addQuery,firstname,lastname,email,phonenumber,password);
	}
}
