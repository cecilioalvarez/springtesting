package es.curso.spring1.test.repositories;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import es.curso.spring1.Persona;
import es.curso.spring1.repositories.PersonaRepository;

@SpringBootTest
@Sql({ "/schema.sql", "/data.sql" })
class Spring1ApplicationTestsDB {

	@Autowired
	PersonaRepository personaRepository;

	@Test
	void personaBuscarTodosTest() {

		List<Persona> personas = personaRepository.findAll();
		assertTrue(personas.contains(new Persona("pepe")));
	}

	@Test
	void personaInsertarTest() {

		personaRepository.save(new Persona("ana", "gomez", 20));
		List<Persona> personas = personaRepository.findAll();
		assertTrue(personas.contains(new Persona("ana")));
	}

}
