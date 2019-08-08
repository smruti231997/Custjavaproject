package com.Cust.CustDemo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Cust.CustDemo.dao.CustDemoDao;
import com.Cust.CustDemo.model.CustDemo;

@Service("custDemoService")
public class CustDemoServiceImpl implements CustDemoService{
	@Autowired
	private CustDemoDao custDemoDao;

	@Override
	public List<CustDemo> findAll() {
		List<CustDemo> custDemolist = custDemoDao.findAll();
		return custDemolist;
	}

	@Override
	public void save(CustDemo custDemo) {
		custDemoDao.save(custDemo);

	}

	@Override
	public void delete(CustDemo custDemo) {
		custDemoDao.delete(custDemo);
	}

	@Override
	public CustDemo findById(Integer id) {

		CustDemo custDemo=custDemoDao.findById(id).get();
		return custDemo;
		
	}

}

