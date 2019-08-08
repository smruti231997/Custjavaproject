package com.Cust.CustDemo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.Cust.CustDemo.model.CustDemo;
import com.Cust.CustDemo.service.CustDemoService;



@RestController
@RequestMapping("/cust")
public class CustDemoController {
	@Autowired
	private CustDemoService custDemoService;

	@GetMapping("/")
	public ModelAndView findAll() {
		List<CustDemo> custList = custDemoService.findAll();
		ModelAndView modelAndView = new ModelAndView("listcust");
		modelAndView.addObject("CUSTLIST", custList);
		return modelAndView;
	}
	
	@PostMapping("/checkuser")
	public ModelAndView requestLogin(@RequestParam String user, @RequestParam String password) {
		ModelAndView modelAndView;
		if ((user.equals("user")) && (password.equals("password"))) {
			modelAndView = new ModelAndView("home");
		} else {
			modelAndView = new ModelAndView("home");
		}
		return modelAndView;
	}

	@PostMapping("/save")
	public ModelAndView save(@RequestParam Integer id, @RequestParam String name, @RequestParam String location,@RequestParam String domain) 
	{
		CustDemo custDemo=new CustDemo();
		custDemo.setId(id);
		custDemo.setName(name);
		custDemo.setLocation(location);
	ModelAndView	 modelAndView = new ModelAndView("listcust");
		custDemoService.save(custDemo);
		/*
		 * List<CustDemo> custList = custDemoService.findAll(); ModelAndView
		 * modelAndView.addObject("CUSTLIST", custList);
		 */
		return modelAndView;
	}
	@PostMapping("/update")
	public ModelAndView modify(@RequestParam Integer id) {
		CustDemo custDemo = custDemoService.findById(id);
		ModelAndView modelAndView = new ModelAndView("updatecustDemo");
		modelAndView.addObject("CUSTDEMO", custDemo);
		return modelAndView;
	}

	@GetMapping("/delete")
	public ModelAndView delete(@RequestParam Integer id) {

		CustDemo custDemo = custDemoService.findById(id);
		custDemoService.delete(custDemo);
		List<CustDemo> custList = custDemoService.findAll();
		ModelAndView modelAndView = new ModelAndView("listcust");
		modelAndView.addObject("CUSTLIST", custList);
		return modelAndView;
	}
	@PostMapping("/retrieve")
	public ModelAndView retrieve(@RequestParam Integer id) {
		CustDemo custDemo = custDemoService.findById(id);
		ModelAndView modelAndView = new ModelAndView("customerinfo");
		modelAndView.addObject("CUSTDEMO", custDemo);
		return modelAndView;
	}
}

