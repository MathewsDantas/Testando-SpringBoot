package com.example.demo.repositories;

import com.example.demo.model.entities.Produto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

// ou JpaRepository<Produto, Integer>
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {
    Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
    //findBy(nome do atributo)ContainingIgnoreCase --> convenção

    @Query("SELECT p FROM Produto p WHERE lower(p.nome) like lower(concat('%', :nome,'%'))")
    Iterable<Produto> searchByNameLike(@Param("nome") String nome);
}
// Esse resolveria apenas o crud básico.
//public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
//}
