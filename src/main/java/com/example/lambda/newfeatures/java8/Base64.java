package com.example.lambda.newfeatures.java8;

import java.io.UnsupportedEncodingException;

public class Base64 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String texto = "A classe base64 no java8!";
        System.out.println(texto);
        
        //Codificar em base64
        try {
            String textoCodificado = java.util.Base64.getEncoder().encodeToString(texto.getBytes("utf-8"));
            // Para URL -> java.util.Base64.getUrlEncoder();
            // Para Mime -> java.util.Base64.getMimeEncoder();
            System.out.println(textoCodificado); //QSBjbGFzc2UgYmFzZTY0IG5vIGphdmE4IQ==

            String textoDecodificado = new String(java.util.Base64.getDecoder().decode(textoCodificado), "utf-8");
            System.out.println(textoDecodificado);
        }catch (Exception e){
            e.printStackTrace();
        }
    }





}
