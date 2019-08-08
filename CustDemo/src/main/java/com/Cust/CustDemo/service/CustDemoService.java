package com.Cust.CustDemo.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.Cust.CustDemo.model.CustDemo;

@Service("custDemoService")
public interface CustDemoService {
public List<CustDemo> findAll();
	
	public void save(CustDemo custDemo);
	
	public void delete(CustDemo custDemo);
	public CustDemo findById(Integer id);
	

	

}
