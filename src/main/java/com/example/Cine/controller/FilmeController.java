package com.example.Cine.controller;

import com.example.Cine.entity.Filme;
import com.example.Cine.repository.FilmeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalogo")
public class FilmeController {
    private FilmeRepository filmeRepository;
    public FilmeController(FilmeRepository filmeRepository){
        this.filmeRepository = filmeRepository;
    }
    @GetMapping
    public ResponseEntity<List<Filme>> filmeBuscar(){
        return ResponseEntity.status(200).body(filmeRepository.findAll());
    }
    @PostMapping("/cadastrar")
    public ResponseEntity<Filme> cadastrarFilme(@RequestBody Filme novoFilme){
       if(novoFilme.getAno()>=1500 && !novoFilme.getNome().isEmpty() && novoFilme.getClassificacao()>4){
           filmeRepository.save(novoFilme);
           return ResponseEntity.status(200).body(novoFilme);
       }
       else{ return ResponseEntity.status(400).build();
       }
    }
    @PutMapping("/atualizar/{idFilme}")
    public ResponseEntity <Filme> atualizarFilme(@PathVariable Integer idFilme, @RequestBody Filme filmeAtualizado){
        //
        filmeAtualizado.setId(idFilme);
        filmeRepository.save(filmeAtualizado);
        return ResponseEntity.status(200).body(filmeAtualizado);
    }
    @DeleteMapping("/excluir/{idFilme}")
    public ResponseEntity <Filme> deletarFilme(@PathVariable Integer idFilme){
        filmeRepository.deleteById(idFilme);
        return ResponseEntity.status(204).build();
    }
}
