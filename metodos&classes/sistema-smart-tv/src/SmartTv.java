public class SmartTv {
    boolean ligada=false;
    int volume=0;
    int canal=25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    //aumentar-baixar canal
    public void aumentarcanal(){
        canal++;
        System.out.println("Canal:" + canal)
    }
    public void diminuircanal(){
        canal--;
        System.out.println("Canal:" + canal)
    }
    
    //aumentar-baixar volume
    public void aumentarVolume(){
        volume++;
        System.out.println("Volume: " + volume);
    }
    public void baixarVolume(){
        volume--;
        System.out.println("Volume: " + volume);
    }

    //ligar-desligar
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=true;
    }
}
