package com.generation18.crudfarmacia.repository;

import java.util.List;

import com.generation18.crudfarmacia.model.Produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long> {
    public List<Produto> findAllByTipoContainingIgnoreCase (String tipo);
}
