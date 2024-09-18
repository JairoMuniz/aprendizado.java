package model;

public class Cachorro extends Animal{
    private int tamanho_fucinho;
    private String cor;
    public Cachorro(String nome, String especie, int idade) {
        super(nome, especie, idade);
    }
    public int getTamanho_fucinho() {
        return tamanho_fucinho;
    }
    public void setTamanho_fucinho(int tamanho_fucinho) {
        this.tamanho_fucinho = tamanho_fucinho;
    }
    public String getCor() {
        return cor; 
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    
    

}
