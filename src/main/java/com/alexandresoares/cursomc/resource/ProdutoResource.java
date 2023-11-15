package com.alexandresoares.cursomc.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/produtos")
public class ProdutoResource {
	
	@GetMapping
	public String mostrar() {
		return "REST Produto Funcionando!";
	}

}
