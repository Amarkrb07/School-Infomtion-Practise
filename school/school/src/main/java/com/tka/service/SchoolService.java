package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.SchoolDao;
import com.tka.entity.School;

@Service
public class SchoolService {
	
	@Autowired
	SchoolDao dao;
	public String insertData(School s) {
		String msg = dao.insertData(s);
		return msg;
	
	}
	
	// delete data method
	
	public String deleteData(int sid) {
		String msg = dao.deleteData(sid);
		return msg;
	}
	
	// update data method 
	
	public String updateData(School s,int sid) {
		String msg = dao.updateData(s, sid);
		
		return msg;
	}
	
}
