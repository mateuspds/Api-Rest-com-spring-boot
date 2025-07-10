package com.example.apijava.resourses;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.apijava.entities.Curso;
import com.example.apijava.entities.dto.CursoDto;
import com.example.apijava.entities.mapper.CursoMapper;
import com.example.apijava.services.CursoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/cursos")
public class CursoResoruce {
    @Autowired
    private CursoService cursoservice;
    @Autowired
    private CursoMapper mapper;

    @GetMapping
    public ResponseEntity<List<Curso>> getCursos() {
        List<Curso> lista = cursoservice.getcCursos();
        return ResponseEntity.ok().body(lista);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> findCurso(@PathVariable Integer id) {
        Curso curso = cursoservice.findById(id);
        return ResponseEntity.ok().body(curso);
    }

    @GetMapping("/nome")
    public ResponseEntity<List<Curso>> findNome(@RequestParam String valor) {
        List<Curso> curso = cursoservice.findByNome(valor);
        return ResponseEntity.ok().body(curso);
    }

    @PostMapping
    public ResponseEntity<Curso> saveCurso(@Valid @RequestBody CursoDto dto) throws URISyntaxException {
        Curso novCurso = cursoservice.save(mapper.mapCursoDtCurso(dto));
        return ResponseEntity.created(new URI("/cursos/salva/" + novCurso.getId())).body(novCurso);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Curso> updateCurso(@Valid @RequestBody CursoDto dto, @PathVariable Integer id)
            throws URISyntaxException {
        Curso cursoAtualizado = mapper.mapCursoDtCurso(dto);
        cursoAtualizado.setId(id);
        cursoservice.update(cursoAtualizado);
        return ResponseEntity.noContent().build();

    }

       @DeleteMapping("/{id}")
    public ResponseEntity<Curso> deleteCurso(@PathVariable Integer id)
            throws URISyntaxException {
         cursoservice.delete(id);
        return ResponseEntity.noContent().build();

    }

}
