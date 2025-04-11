package es.curso.spring1;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.curso.spring1.services.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaRestController {

	private final PersonaService personaService;
	
	
	public PersonaRestController(PersonaService personaService) {
		super();
		this.personaService = personaService;
	}


	@GetMapping
	public List<Persona> buscarTodos() {
		
		return personaService.buscarTodasLasPersonas();
	}
	
}
