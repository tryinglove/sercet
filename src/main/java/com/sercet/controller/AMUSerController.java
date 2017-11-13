package com.sercet.controller;

import com.sercet.service.AMUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
@RequestMapping(value = "/user")
public class AMUSerController {
	@Autowired
    AMUserService userService;
	@RequestMapping(value = "/get")
	public ModelAndView getAllUser(){
		ModelAndView mView = new ModelAndView();
		mView.addObject("user", userService.getAll().get(0));
		mView.setViewName("index");
		return mView;
	}
}
