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

import br.com.guilherme.senac.model.Patrimonio;
import br.com.guilherme.senac.repository.PatrimonioRepository;

@RestController
@RequestMapping("/patrimonio")
public class PatrimonioController {
	
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
	private PatrimonioRepository pr;
	
	
	
	//MÉTODO -> get
	@GetMapping("/listar")
	public List <Patrimonio> listar(){
		return pr.findAll();
	}
	
	//MÉTODO -> post
	@PostMapping("/cadastrar")
	public String cadastro(@RequestBody Patrimonio patrimonio ) {
		pr.save(patrimonio);
		return "Patrimonio cadastrado com sucesso!";
	}
	
	//MÉTODO -> put
	@PutMapping("/atualizar/{id}")
	public String atualizar(@RequestBody Patrimonio patrimonio,@PathVariable Long id) {
		Optional<Patrimonio> pa = pr.findById(id);
		if(!pa.isPresent()) {
			return "Patrimonio não encontrado";
		}
		patrimonio.setIdPatrimonio(id);
		pr.save(patrimonio);
		return "Patrimonio atualizado com sucesso";
	}
	//MÉTODO -> delet
	@DeleteMapping("/apagar/{id}")
	public String apagar(@PathVariable Long id) {
		pr.deleteById(id);
		return "Patrimonio apagado com sucesso!";
	}
}
