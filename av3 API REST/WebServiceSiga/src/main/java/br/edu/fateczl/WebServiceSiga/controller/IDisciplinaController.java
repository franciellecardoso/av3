package br.edu.fateczl.WebServiceSiga.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import br.edu.fateczl.WebServiceSiga.model.dto.DisciplinaDTO;
import br.edu.fateczl.WebServiceSiga.model.entity.Disciplina;

public interface IDisciplinaController {
	public List<DisciplinaDTO> buscarDisciplinas();

	public ResponseEntity<DisciplinaDTO> buscarDisciplina(int codigo);

	public ResponseEntity<DisciplinaDTO> buscarDisciplinaPorNome(String nome);

	public ResponseEntity<String> insereDisciplina(Disciplina disciplina);

	public ResponseEntity<String> atualizaDisciplina(Disciplina disciplina);

	public ResponseEntity<String> excluiDisciplina(Disciplina disciplina);
}
