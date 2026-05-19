package com.bramura.productapi.service;

import com.bramura.productapi.model.Product;
import com.bramura.productapi.repository.ProductRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> listarProdutos() {
        return repository.findAll();
    }

    public Product buscarPorId(Long id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Produto não encontrado"));
    }

    public Product criarProduto(Product product) {
        return repository.save(product);
    }

    public Product atualizarProduto(Long id, Product produtoAtualizado) {

        Product product = buscarPorId(id);

        product.setName(produtoAtualizado.getName());
        product.setPrice(produtoAtualizado.getPrice());

        return repository.save(product);
    }

    public void deletarProduto(Long id) {

        Product product = buscarPorId(id);

        repository.delete(product);
    }
}