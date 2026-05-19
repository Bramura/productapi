package com.bramura.productapi.controller;

import com.bramura.productapi.model.Product;
import com.bramura.productapi.service.ProductService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> listarProdutos() {
        return service.listarProdutos();
    }

    @GetMapping("/{id}")
    public Product buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Product criarProduto(@Valid @RequestBody Product product) {
        return service.criarProduto(product);
    }

    @PutMapping("/{id}")
    public Product atualizarProduto(
            @PathVariable Long id,
            @Valid @RequestBody Product produtoAtualizado
    ) {

        return service.atualizarProduto(id, produtoAtualizado);
    }

    @DeleteMapping("/{id}")
    public String deletarProduto(@PathVariable Long id) {

        service.deletarProduto(id);

        return "Produto deletado com sucesso!";
    }
}