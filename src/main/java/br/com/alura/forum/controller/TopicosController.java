package br.com.alura.forum.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
public class TopicosController {

	private static final List<Topico> topicos = new ArrayList<>();

	static {
		Curso curso = new Curso("Curso Spring", "Programção Java");
		Topico topico = new Topico("Dúvida", "Duvida com spring", curso);

		topicos.addAll(Arrays.asList(topico, topico, topico));
	}

	@RequestMapping("/topicos")
	public List<TopicoDto> lista() {
		return TopicoDto.converter(topicos);
	}
}
