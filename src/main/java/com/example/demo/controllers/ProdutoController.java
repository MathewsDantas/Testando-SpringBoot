package com.example.demo.controllers;

import com.example.demo.model.entities.Produto;
import com.example.demo.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;//Injeção de dependência

//   @PostMapping("")
//    public @ResponseBody Produto novoProduto(@Valid @RequestParam String nome,
//                                             @RequestParam double preco,
//                                             @RequestParam double desconto,
//                                             @RequestParam String descricao){
//        Produto produto = new Produto(nome,preco,desconto,descricao);
//        produtoRepository.save(produto);
//        return produto;
//    }

    // ou simplesmente -->

    @PostMapping
    public Produto novoProduto(@RequestBody @Valid Produto produto){
        produtoService.novoProduto(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProduto(){
        return produtoService.obterProduto();
    }

    @GetMapping(path = "/{id}")
    public Optional<Produto> obterProdutoId(@PathVariable int id){
        return produtoService.obterProdutoId(id);
    }

    @GetMapping(path = "/pagina/{numeroPagina}")
    public Iterable<Produto> obterProdutosPorPagina(@PathVariable int numeroPagina){
        Pageable page = PageRequest.of(numeroPagina,3);
        return produtoService.obterProdutosPorPagina(numeroPagina);
    }

    @GetMapping(path = "/nome/{parteNome}")
    public Iterable<Produto> obterProdutoPorNome(@PathVariable("parteNome") String parteNome){
        return produtoService.obterProdutoPorNome(parteNome);
    }

    @PutMapping
    public Produto alterarProduto(@Valid Produto produto){
        produtoService.alterarProduto(produto);
        return produto;
    }

    @DeleteMapping(path = "/{id}")
    public void excluirProduto(@PathVariable int id){
        produtoService.excluirProduto(id);
    }
}
