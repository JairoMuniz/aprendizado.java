public class TiposDeVariaveis {
    public static void main(String[] args) throws Exception {
        // Tipos primitivos:
        // byte: Representa um inteiro de 8 bits.
        // short: Representa um inteiro de 16 bits.
        // int: Representa um inteiro de 32 bits.
        // long: Representa um inteiro de 64 bits.
        // float: Representa um número de ponto flutuante de 32 bits.
        // double: Representa um número de ponto flutuante de 64 bits.
        // char: Representa um caractere Unicode de 16 bits.
        // boolean: Representa um valor booleano (verdadeiro ou falso).
        // double salarioMinimo = 2500;
        

        short numeroCurto = 2;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        final int NUMERO = 1 + 1;

        System.out.println(NUMERO);

        // String
        String nome = "Jairo Muniz";

        System.out.println(nome);
    }
}
