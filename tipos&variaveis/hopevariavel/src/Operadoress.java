public class Operadoress {
    public static void main(String[] args){
        String nomeCompleto = "linguagem" + " java";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+"1"+1+1;   //após uma concatenação, a variavel não faz mais o calculo.
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";   //com a concatenação no final, a variavel faz o calculo.
        System.out.println(concatenacao);
    }

}
