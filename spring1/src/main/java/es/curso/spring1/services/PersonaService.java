package es.curso.spring1.services;

import java.util.List;

import org.springframework.stereotype.Service;

import es.curso.spring1.Persona;
import es.curso.spring1.repositories.PersonaRepository;
@Service
public class PersonaService {

	private final PersonaRepository personaRepository;

	
	public PersonaService(PersonaRepository personaRepository) {
		super();
		this.personaRepository = personaRepository;
	}

	public List<Persona> buscarTodasLasPersonas() {
		
		return personaRepository.findAll();
	}
}
