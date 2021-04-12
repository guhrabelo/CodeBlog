package com.spring.codeBlog.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.codeBlog.model.Postagem;
import com.spring.codeBlog.repository.CodeBlogRepository;

@Component
public class DummyData {

	@Autowired
	CodeBlogRepository codeBlogRepository;

	//@PostConstruct
	public void savePostagem() {

		List<Postagem> postagemList = new ArrayList<>();
		Postagem postagem1 = new Postagem();
		postagem1.setAutor("Gustavo Rabelo");
		postagem1.setData(LocalDate.now());
		postagem1.setTitulo("Teste1");
		postagem1.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
				+ "Nullam consequat luctus enim, vitae fringilla dui malesuada non. Donec in euismod massa. "
				+ "Donec ultrices nisi nunc, a lobortis lacus tristique vitae. Fusce consequat porttitor lorem ac gravida. "
				+ "Nulla convallis lorem a mauris posuere, in suscipit lacus lobortis. Nunc non consectetur odio, nec vulputate lectus. "
				+ "Integer pellentesque magna ut metus porttitor, quis.");
		
		Postagem postagem2 = new Postagem();
		postagem2.setAutor("Gustavo Rabelo");
		postagem2.setData(LocalDate.now());
		postagem2.setTitulo("Teste2");
		postagem2.setTexto("Lorem ipsum dolor sit amet, consectetur adipiscing elit. "
				+ "Aliquam blandit diam nulla, sit amet bibendum sem gravida at. Sed efficitur commodo vestibulum. "
				+ "Donec eget velit rhoncus, pellentesque libero sit amet, accumsan magna. "
				+ "Vivamus scelerisque massa id nibh suscipit venenatis. Curabitur non massa augue. Sed vitae volutpat sem. "
				+ "In at purus et ex interdum hendrerit ac quis velit.");
		
		postagemList.add(postagem1);
		postagemList.add(postagem2);
		
		for(Postagem postagem : postagemList) {
			Postagem postagemSaved = codeBlogRepository.save(postagem);
			System.out.println(postagemSaved.getId());
		}
	}
}
