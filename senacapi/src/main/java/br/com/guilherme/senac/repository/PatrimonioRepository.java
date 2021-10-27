package br.com.guilherme.senac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guilherme.senac.model.Patrimonio;

public interface PatrimonioRepository extends JpaRepository<Patrimonio , Long>{

}
