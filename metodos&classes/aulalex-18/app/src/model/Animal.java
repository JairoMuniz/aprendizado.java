package model;

public class Animal {
    private String nome;
    private String especie;
    private int idade;

    
    public Animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public void fazer_barulho() {
        System.out.println("Som de animal");
    }

    public void dormir() {
        System.out.println("Dormindo");
    }

    public void comer() {
        System.out.println("Comendo");
    }

    public void mover() {
        System.out.println("Movendo");
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

   
}
