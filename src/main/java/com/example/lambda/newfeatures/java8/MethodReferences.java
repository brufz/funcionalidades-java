package com.example.lambda.newfeatures.java8;
interface Figura2D{
    void desenha(Double largura, Double altura);
}

class Retangulo{
    public void desenhaRetangulo(Double largura, Double altura){
    System.out.println("Desenha retangulo de largura: " + largura + " e altura: " + altura);
    }
}

class Retangulo2{
    public Retangulo2(Double largura, Double altura){
        System.out.println("Desenha retangulo de largura: " + largura + " e altura: " + altura);
    }
}

public class MethodReferences {
    public static void main(String[] args) {
        //lambda
        Figura2D fig1 = (l, a) -> System.out.println("Desenha figura de largura: " + l + " e altura: " + a);
        fig1.desenha(8.0, 3.0);

        //method reference
        //classe ou objeto :: metodo referenciado
        //Via método estático pode chamar a partir da propria classe
        Retangulo ret = new Retangulo();
        Figura2D fig2 = ret::desenhaRetangulo;
        fig2.desenha(8.0, 3.5);

        //via construtor
        Figura2D fig3 = Retangulo2::new;
        fig3.desenha(10.0, 3.0);


    }
}
