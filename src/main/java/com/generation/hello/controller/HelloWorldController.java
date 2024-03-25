package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController
{
	@GetMapping() // Requisições di tipo GET/busca
	public String hello()
	{
		return "Hello World! <br> Responsabilidade pessoal <br> Trabalho em equipe <br> Persistência <br> Orientação ao detalhe <br> Comunicação <br> Orientação ao futuro <br> Mentalidade de crescimento <br> Resolução de problemas";
	}
}
