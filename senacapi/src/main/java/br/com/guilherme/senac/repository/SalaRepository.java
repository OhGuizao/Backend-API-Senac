package br.com.guilherme.senac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guilherme.senac.model.Sala;

public interface SalaRepository extends JpaRepository<Sala, Long>{

}
