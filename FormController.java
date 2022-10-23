package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
	@Autowired
	UserRepo repo;
	EmailRepo repo1;
	@RequestMapping("/")
	public String details() {
		return "user";
	}
	@RequestMapping("/details")
	public String details(Users customers) {
		repo.save(customers);
		return "user";
	}
	@RequestMapping("/getdetails")
	public String getdetails() {
		return "ViewUser";
	}
	@RequestMapping("uemail")
	public String details1() {
		return "email";
	}
	@RequestMapping("/details1")
	public String details1(Email semail) {
		repo1.save(semail);
		return "email";
	}
	@RequestMapping("/getdetails1")
	public String getdetails1() {
		return "ViewEmail";
	}

	
@PostMapping("/getdetails")
public ModelAndView getdetails(@RequestParam int cid)

{
	ModelAndView mv=new ModelAndView("Retrieve");
	Users  customers=repo.findById(cid).orElse(null);
	mv.addObject(customers);
	return mv;	
}
@PostMapping("/getdetails1")
public ModelAndView getdetails1(@RequestParam int cid)

{
	ModelAndView mv=new ModelAndView("Retrieve1");
	Email  semail=repo1.findById(cid).orElse(null);
	mv.addObject(semail);
	return mv;	
}

	

}
