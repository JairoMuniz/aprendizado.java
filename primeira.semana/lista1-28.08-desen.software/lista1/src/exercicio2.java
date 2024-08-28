import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) throws Exception {
        int a,b,c;
        float r,s,d;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor de A");
        a = ler.nextInt();
        while (a<0) {
            System.out.println("Digite novamente");
            a = ler.nextInt();
        }

        do {
            System.out.println("Digite o valor de B.");
        } while (b<0);

        for(int i = 3; i>0;i--){
            System.out.println("digite c(vc tem"+i+"tentativas")");
        }
}
