public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
        System.out.println("Televisão Ligada" + ligada);
    }

    public void desligada(){
        ligada = false;
        System.out.println("Televisão Desligada" + ligada);
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Mudando o Canal para: " + canal);
    }

    public void mudarCanal(int novocanal){
        canal = novocanal;
    }
}
