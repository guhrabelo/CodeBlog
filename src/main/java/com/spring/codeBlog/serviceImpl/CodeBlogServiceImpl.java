package com.spring.codeBlog.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.codeBlog.model.Postagem;
import com.spring.codeBlog.repository.CodeBlogRepository;
import com.spring.codeBlog.service.CodeBlogService;

@Service
public class CodeBlogServiceImpl implements CodeBlogService{
	
	@Autowired
	CodeBlogRepository codeBlogRepository;

	@Override
	public List<Postagem> findAll() {
		return codeBlogRepository.findAll();
	}

	@Override
	public Postagem findById(long id) {
		return codeBlogRepository.findById(id).get();
	}

	@Override
	public Postagem save(Postagem postagem) {
		return codeBlogRepository.save(postagem);
	}
	
}
