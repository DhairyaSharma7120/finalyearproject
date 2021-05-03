package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.PropertyDAO;
import com.project.model.PropertyImageVO;
import com.project.model.PropertyVO;


@Service
@Transactional
public class PropertyServiceImpl implements PropertyService{

	@Autowired
	PropertyDAO propertyDAO;
	
	@Override
	public void saveProperty(PropertyVO propertyVO) {
		this.propertyDAO.saveProperty(propertyVO);
	}

	@Override
	public List searchProperty() {
		return this.propertyDAO.searchProperty();

	}

	@Override
	public List deleteProperty(PropertyVO propertyVO) {
		 return this.propertyDAO.deleteProperty(propertyVO);
	}

	@Override
	public List editProperty(PropertyVO propertyVO) {
		return this.propertyDAO.editProperty(propertyVO);

	}

	@Override
	public void savePropertyImage(PropertyImageVO productImageVO) {
		this.propertyDAO.savePropertyImage(productImageVO);
		
	}

	@Override
	public List searchProductImage(int id) {
		return this.propertyDAO.searchProductImage(id);
	}
}
