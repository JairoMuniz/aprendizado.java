public class usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smarttv = new SmartTv();
        
        System.out.println("A tv está ligada? " + smarttv.ligada);
        System.out.println("O volume da tv é: " + smarttv.volume);
        System.out.println("O canal da tv é: " + smarttv.canal);

        //mudar canal
        smarttv.mudarCanal(30);
        System.out.println("O novo canal da tv é: " + smarttv.canal);

        //aumentar-baixar volume
        smarttv.aumentarVolume();
        smarttv.aumentarVolume();
        smarttv.aumentarVolume();
        smarttv.aumentarVolume();
        smarttv.aumentarVolume();
        smarttv.baixarVolume();


        //ligar-desligar
        smarttv.ligar();
        System.out.println("novo status --> A tv está desligada? " + smarttv.ligada);
        smarttv.desligar();
        System.out.println("novo status --> A tv está ligada? " + smarttv.ligada);
    }
}
