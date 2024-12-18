package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springcore.jdbc.entities.Student;

public  class StudentDAOImp implements StudentDAO{
	
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		String query="Insert into student(id, name, city) values(?,?,?)";
		int r=jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	public int change(Student student) {
		String query="Update student set name=? , city=? where id=?";
		int r=jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	public int delete(Student student) {
		String query="Delete from student where id=?";
		int r=jdbcTemplate.update(query,student.getId());
				return r;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
	}
	
	

}
