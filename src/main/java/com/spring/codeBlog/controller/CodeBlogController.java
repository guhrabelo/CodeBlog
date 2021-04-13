package com.spring.codeBlog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.codeBlog.model.Postagem;
import com.spring.codeBlog.service.CodeBlogService;

@Controller
public class CodeBlogController {
	
	@Autowired
	CodeBlogService codeBlogService;
	
	@RequestMapping(value = "/postagem", method = RequestMethod.GET)
	public ModelAndView getPostagens() {
		ModelAndView mv = new ModelAndView("postagens");
		List<Postagem> postagens = codeBlogService.findAll();
		mv.addObject("postagens", postagens);
		return mv;
		
	}
}
