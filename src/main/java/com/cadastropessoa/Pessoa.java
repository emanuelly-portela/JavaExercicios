
package com.cadastropessoa;

public class Pessoa {
    String nome; 
    int idade;
    String endereco;
    
    public Pessoa(String nome, int idade, String endereco){
        this.nome=nome;
        this.idade=idade;
        this.endereco=endereco;
    }

    @Override
    public String toString() {
        return super.toString();
    }
      
}
