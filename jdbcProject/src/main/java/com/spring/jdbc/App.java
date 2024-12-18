package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.jdbc.dao.StudentDAO;
import com.springcore.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/jdbc/conf.xml");
      StudentDAO studentDao= context.getBean("studentDao", StudentDAO.class);
//      Student student=new Student();
//      student.setId(23);
//      student.setName("Rahul");
//      student.setCity("Rohanipur");
//      int rowsAffected=studentDao.insert(student);
//      System.out.println("Total rows afftected are "+ rowsAffected);
//      Student student=new Student();
//      student.setId(23);
//      student.setName("Aditya");
//      student.setCity("bhagalpur");
//      int rowsAffected=studentDao.change(student);
//      System.out.println("Total rows changed  "+ rowsAffected);
      
      Student student=new Student();
      student.setId(23);
      int rowDeleted=studentDao.delete(student);
      System.out.println("Total rows changed  "+ rowDeleted);
    }
}
