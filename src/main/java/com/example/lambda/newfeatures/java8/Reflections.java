package com.example.lambda.newfeatures.java8;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class Produto {
    private String descricao;
    private Double preco;

public Produto( String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
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



public class Reflections {
    public static void main(String[] args) {
        //instancia da classe produto
        Produto p = new Produto("Geladeira", 6000.0);
        // instancia da classe Class
        Class c = p.getClass();
        //Todos os campos declarados na classe produto
        Field[] declaredFields = c.getDeclaredFields();
        //Todos os métodos declarados na classe produto
        Method[] declaredMethods = c.getDeclaredMethods();

        for (Method methods :declaredMethods) {
            System.out.println("Metodos: " + methods);
            Parameter[] parameters = methods.getParameters();

            for (Parameter pr : parameters){
                System.out.println("Parametros: " + pr);
            }
        }
    }
}
