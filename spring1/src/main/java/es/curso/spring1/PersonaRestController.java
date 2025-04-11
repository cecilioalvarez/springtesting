package es.curso.spring1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.curso.spring1.repositories.PersonaRepository;

@RestController
@RequestMapping("/personas")
public class PersonaRestController {

	@Autowired
	PersonaRepository personaRepository;
	
	
	@GetMapping
	public List<Persona> buscarTodos() {
		
		return personaRepository.findAll();
	}
	
}
