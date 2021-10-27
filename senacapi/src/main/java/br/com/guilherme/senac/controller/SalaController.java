package br.com.guilherme.senac.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.guilherme.senac.model.Sala;
import br.com.guilherme.senac.repository.SalaRepository;

@RestController
@RequestMapping("/sala")
public class SalaController {
	
	/*
	 * 
	 *  Explicação da @Autowired...
	 *  A anotação autowired gera um objeto do MedicoRepository
	 *  em tempo de execução, ou seja, no momento de rodar a 
	 *  aplicação
	 * 
	 */
	
	
	//Importei o Autowired
	@Autowired
	private SalaRepository sr;
	
	//MÉTODO -> get
	@GetMapping("/listar")
	public List <Sala> listar(){
		return sr.findAll();
	}
	
	//MÉTODO -> post 
	@PostMapping("/cadastrar")
	public String cadastro(@RequestBody Sala sala) {
		sr.save(sala);
		return "Sala cadastrada com sucesso";
	}
	//MÉTODO -> put
	@PutMapping("/atualizar/{id}")
	public String atualizar(@RequestBody Sala sala, @PathVariable Long id) {
		Optional<Sala> sa = sr.findById(id);
		if(!sa.isPresent()) {
			return "Sala não encontrada";
		}
		sala.setIdSala(id);
		sr.save(sala);
		return "Sala atualizada com sucesso";
}
	//MÉTODO -> delet
	@DeleteMapping("apagar/{id}")
	public String apagar (@PathVariable Long id) {
		sr.deleteById(id);
		return "Sala apagada com sucesso!";
	}
}
