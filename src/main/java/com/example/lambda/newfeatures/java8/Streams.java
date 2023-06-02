package com.example.lambda.newfeatures.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Produtos{
    private Integer quantidade;
    private String descricao;
    private Double preco;

    public Produtos(Integer quantidade, String descricao, Double preco) {
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produtos() {
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

public class Streams {
    public static void main(String[] args) {

        List<Produtos> listaProdutos = new ArrayList<>();
        listaProdutos.add(new Produtos(1000, "Geladeira 470L", 2999.00));
        listaProdutos.add(new Produtos(1000, "Geladeira 600L", 3999.00));
        listaProdutos.add(new Produtos(2000, "TV 50", 3500.00));
        listaProdutos.add(new Produtos(3000, "TV 60", 4200.00));
        listaProdutos.add(new Produtos(4500, "Computador i5", 6999.00));
        listaProdutos.add(new Produtos(100, "Microondas 20L", 800.00));

        //lista de geladeiras
        List<Produtos> listaGeladeiras = listaProdutos
                .stream()
                .filter(p -> p.getDescricao().toLowerCase()
                        .contains("Geladeira".toLowerCase()))
                .collect(Collectors.toList());

        //ordena a lista de geladeiras
        Collections.sort(listaGeladeiras, new OrdenaProdutoPorPreco());

        //lista dos nomes das geladeiras
        List<String> listaNomeGeladeiras = listaGeladeiras
                .stream()
                .map(p -> p.getDescricao())
                .collect(Collectors.toList());

        //exibe o nome das geladeiras
        for (String nome :listaNomeGeladeiras) {
            System.out.println(nome);
        }

        //um só fluxo de dados => pipeline
        listaProdutos.stream().filter(p -> p.getDescricao().toLowerCase()
                .contains("Geladeira".toLowerCase()))
                .sorted((p1, p2) -> p1.getPreco()
                        .compareTo(p2.getPreco()))
                .map(p-> p.getDescricao())
                .forEach(System.out::println);
    }
}

class OrdenaProdutoPorPreco implements Comparator<Produtos>{

    @Override
    public int compare(Produtos p1, Produtos p2) {
        return p1.getPreco().compareTo(p2.getPreco());
    }
}

