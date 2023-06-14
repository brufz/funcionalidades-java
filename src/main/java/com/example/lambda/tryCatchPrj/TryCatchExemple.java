package com.example.lambda.tryCatchPrj;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchExemple {
    public static void main(String[] args) throws IOException {
        readFileWithTryCatchFinally("file2.txt");

        readFileWithTryWithRecurse("file2.txt");
    }

    //Antes do java 7
    public static void readFileWithTryCatchFinally(String path) throws IOException {
        String linha = "";
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        }catch (IOException e){
            throw e;
        } finally {
            if(br != null){
                br.close();
            }
        }
    }

    //depois java 7
    // omissão da clausula catch pois possui na assinatura do método
    public static void readFileWithTryWithRecurse(String path) throws IOException {
        String linha = "";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        }
    }
}
