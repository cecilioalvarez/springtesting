package es.curso.spring1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.curso.spring1.Persona;

public interface PersonaRepository  extends JpaRepository<Persona,String>{

}
