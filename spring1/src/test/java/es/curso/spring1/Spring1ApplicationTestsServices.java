package es.curso.spring1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import es.curso.spring1.repositories.PersonaRepository;
import es.curso.spring1.services.PersonaService;

@SpringBootTest
@Sql({ "/schema.sql", "/data.sql" })
class Spring1ApplicationTestsServices {

	@Mock
	PersonaRepository personaRepository;
	
	@Autowired
	PersonaService personaService;
	

	@Test
	void personaServiceBuscarTodosTest() {

		Mockito.when(personaRepository.findAll()).thenReturn (List.of(new Persona ("pepe","perez",20)));
		
		List<Persona> listaPersonas=personaService.buscarTodasLasPersonas();
		Persona persona= listaPersonas.get(0);
		assertEquals (new Persona("pepe","perez",20),persona);
	}
	

}
