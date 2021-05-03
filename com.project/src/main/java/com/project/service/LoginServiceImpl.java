package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.LoginDAO;
import com.project.model.LoginVO;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDAO loginDAO;
	
	@Override
	public List searchLoginByUsername(String username) {
		return this.loginDAO.searchLoginByUsername(username);
		
	}

	@Override
	public void saveLogin(LoginVO loginVO) {
		this.loginDAO.saveLogin(loginVO);
		
	}

}
