package com.example.demo.model.repositories;

import com.example.demo.model.entities.Produto;
import org.springframework.data.repository.PagingAndSortingRepository;

// ou JpaRepository<Produto, Integer>
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {
    Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
    //findBy(nome do atributo)ContainingIgnoreCase --> convenção
}
// Esse resolveria apenas o crud básico.
//public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
//}
