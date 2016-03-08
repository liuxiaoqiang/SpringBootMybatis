package com.berwin.cloud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.berwin.cloud.model.BaseDate;
import com.berwin.cloud.service.BaseDateService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	private static final Logger logger = Logger.getLogger(HomeController.class);

	@Autowired
	private BaseDateService basedateService;
	
	@RequestMapping("/list")
	public String Hello(){
		return "Hello World";
	}
	
	@RequestMapping("/data")
	public ModelAndView find(Model model){
		List<BaseDate> list = basedateService.find();
		logger.info("查询得到的list为： " + list);
		model.addAttribute("list", list);
		return new ModelAndView("index");
	}
}
