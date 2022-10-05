package com.example.lesson06.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson06.dao.Lesson06NewUserDAO;

@Service
public class Lesson06NewUserBO {
	@Autowired
	private Lesson06NewUserDAO newUserDAO;
	
	public void addNewUser(String name, String yyyymmdd, String introduce, String email) {
		newUserDAO.insertNewUser(name, yyyymmdd, introduce, email);
	}
}
