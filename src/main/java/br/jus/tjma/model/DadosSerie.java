package br.jus.tjma.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String strTitulo, @JsonAlias("totalSeasons") Integer intTotalTemporadas, @JsonAlias("imdRating") String strAvaliacao) {

}
