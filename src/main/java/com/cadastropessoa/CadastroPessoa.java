package com.cadastropessoa;

import java.util.Scanner;

public class CadastroPessoa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de pessoas a serem cadastradas: ");
        int numPessoas = input.nextInt();
               
        Pessoa[] pessoas = new Pessoa[numPessoas];
        for (int i = 0; i < numPessoas; i++) {
            input.nextLine(); // Limpar scanner
            
            System.out.print("Digite o nome da pessoa " + (i+1) + ": ");
            String nome = input.nextLine();
            
            System.out.print("Digite a idade da pessoa " + (i+1) + ": ");
            int idade = input.nextInt();
            input.nextLine(); // Limpar scanner
            
            System.out.print("Digite o endereço da pessoa " + (i+1) + ": ");
            String endereco = input.nextLine();
            
            pessoas[i] = new Pessoa(nome, idade, endereco);
        }

        System.out.println("\nCadastro de Pessoas:");
        for (int i = 0; i < numPessoas; i++) {
            System.out.println(" Nome = " + pessoas[i].nome); 
            System.out.println(" Idade = " + pessoas[i].idade);
            System.out.println(" Endereco = " + pessoas[i].endereco);
        }

        input.close();
    }
}

