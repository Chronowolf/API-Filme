package com.example.Cine.repository;

import com.example.Cine.entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmeRepository extends JpaRepository<Filme,Integer> {
    //@Override
    // List<Filme> findAll();
}
