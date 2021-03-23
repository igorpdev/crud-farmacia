package com.generation18.crudfarmacia.repository;

import java.util.List;

import com.generation18.crudfarmacia.model.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    public List<Categoria> findAllBySessaoContainingIgnoreCase (String sessao);
}
