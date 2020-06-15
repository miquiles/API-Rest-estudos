package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Pedro Henrique");
		cliente1.setTelefone("32252222");
		cliente1.setEmail("pedro@gmail.com");
		
		Cliente cliente2 = new Cliente();
		
		cliente2.setId(2L);
		cliente2.setNome("Amanda Alves");
		cliente2.setTelefone("32255555");
		cliente2.setEmail("amanda@gmail.com");
		
		
		return Arrays.asList(cliente1, cliente2 );
	}

}
