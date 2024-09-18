import model.Animal;
import model.Cachorro;

public class App {
    public static void main(String[] args) throws Exception {
        Animal a = new Animal("Rex", "Cachorro", 5);
        System.out.println("Nome do animal:" + a.getNome());
        System.out.println("especie do animal:" + a.getEspecie());
        System.out.println("idade do animal:" + a.getIdade());

        Cachorro C = new Cachorro("dannilson", "buldog frances", 2);
        System.out.println("Nome do animal:" + C.getNome());
        C.fazer_barulho();
        C.dormir();
        C.comer();
        C.mover();
        

    }
}
