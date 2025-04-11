package es.curso.spring1.test.rest;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import es.curso.spring1.Persona;
import es.curso.spring1.PersonaRestController;
import es.curso.spring1.services.PersonaService;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class Spring1ApplicationTestRest {

	@Autowired
	MockMvc mockMVC;
	
	@Mock
	PersonaService personaServiceMock;
	
	PersonaRestController personaRestController;

	@Test
	void personaBuscarTodosRestTest() throws Exception {

		Mockito.when(personaServiceMock.buscarTodasLasPersonas()).thenReturn(List.of(new Persona("pepe","perez",20)));
		personaRestController= new PersonaRestController(personaServiceMock);
		
		mockMVC.perform(get("/personas")).andExpect(status().isOk());
		
		
	}


}
