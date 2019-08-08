package com.Cust.CustDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Cust.CustDemo.model.CustDemo;

public interface CustDemoDao  extends JpaRepository<CustDemo, Integer>{

}
