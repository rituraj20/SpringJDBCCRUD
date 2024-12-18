package com.spring.jdbc.dao;

import com.springcore.jdbc.entities.Student;

public interface StudentDAO {
	public int insert(Student student);
	public int change(Student student);
	public int delete(Student student);
}
