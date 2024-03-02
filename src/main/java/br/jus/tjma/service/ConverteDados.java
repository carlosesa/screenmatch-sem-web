/**
 * 
 */
package br.jus.tjma.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 */
public class ConverteDados implements IConverteDados {
	private ObjectMapper mapper = new ObjectMapper();

	@Override
	public <T> T obterDados(String json, Class<T> classe) throws JsonMappingException, JsonProcessingException {
		return mapper.readValue(json, classe);
	}

}
