package com.example.demo.service;

import com.example.demo.model.entities.Produto;
import com.example.demo.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;//Injeção de dependência

//    @PostMapping()
//    public @ResponseBody
//    Produto novoProduto(@Valid @RequestParam String nome,
//                        @RequestParam double preco,
//                        @RequestParam double desconto,
//                        @RequestParam String descricao){
//        Produto produto = new Produto(nome,preco,desconto,descricao);
//        produtoRepository.save(produto);
//        return produto;
//    }

    // ou simplesmente -->

    public void novoProduto(Produto produto){
        produtoRepository.save(produto);
    }

    public Iterable<Produto> obterProduto(){
        return produtoRepository.findAll();
    }


    public Optional<Produto> obterProdutoId(int id){
        return produtoRepository.findById(id);
    }


    public Iterable<Produto> obterProdutosPorPagina(int numeroPagina){
        Pageable page = PageRequest.of(numeroPagina,3);
        return produtoRepository.findAll(page);
    }

    public Iterable<Produto> obterProdutoPorNome(String parteNome){
        return produtoRepository.searchByNameLike(parteNome);
    }

    public void alterarProduto(Produto produto){
        produtoRepository.save(produto);
    }

    public void excluirProduto(@PathVariable int id){
        produtoRepository.deleteById(id);
    }
}
