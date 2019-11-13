package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.bean.EmployeeDetails;
import com.ibm.bean.ProjectDetails;
import com.ibm.repository.UserRepositoryEmployee;
import com.ibm.repository.UserRepositoryProject;

@Service
public class UserService {

	@Autowired
	UserRepositoryEmployee repo;
	
	@Autowired
	UserRepositoryProject repoproject;

	public List<String> findAllNameAndAddress(String str) {
		return repo.findAllNameAndAddress(str);
	}

	public Iterable<EmployeeDetails> findAll() {
		return repo.findAll();
	}

	public void save(ProjectDetails project) {
		// TODO Auto-generated method stub
		repoproject.save(project);
	}
	
	
}