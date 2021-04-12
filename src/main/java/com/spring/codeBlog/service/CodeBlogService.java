package com.spring.codeBlog.service;

import java.util.List;

import com.spring.codeBlog.model.Postagem;

public interface CodeBlogService {
	
	List<Postagem> findAll();
	
	Postagem findById(long id);
	
	Postagem save (Postagem postagem);
}
