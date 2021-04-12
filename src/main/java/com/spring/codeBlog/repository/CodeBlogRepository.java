package com.spring.codeBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.codeBlog.model.Postagem;

public interface CodeBlogRepository extends JpaRepository<Postagem, Long>{
	
	
}
