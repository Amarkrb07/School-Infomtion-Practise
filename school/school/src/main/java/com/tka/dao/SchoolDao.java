package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.School;

@Repository
public class SchoolDao {
	
	@Autowired
	SessionFactory factory;
	
	
	// data save method
	public String insertData(School s) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		
		ss.persist(s);
		tr.commit();
		ss.clear();
		return "Data is inserted";
	}
	
	// data delete method
	
	public String deleteData(int sid) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		School s = ss.get(School.class, sid);
		ss.remove(s);
		tr.commit();
		ss.clear();
		
		return "Data is deleted..!";
	}
	
	public String updateData(School s , int sid) {
		Session ss = factory.openSession();
		Transaction tr = ss.beginTransaction();
		School s1 = ss.get(School.class, sid);
		s1.setName(s.getName());
		s1.setCity(s.getCity());
		
		ss.merge(s1);
		tr.commit();
		ss.close();
		
		return "Data is updated...!";
	}
	

}
