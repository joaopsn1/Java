public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
        System.out.println("--------------");
        System.out.println("  LIGANDO TV  ");
        System.out.println("--------------");
    }
    public void desligar() {
        ligada = false;
        System.out.println("---------------");
        System.out.println(" DESLIGANDO TV ");
        System.out.println("---------------");
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("--------------------------------");
        System.out.println("AUMENTANDO O VOLUME PARA: " + volume);
        System.out.println("--------------------------------");
    }
    public void diminuirVolume() {
        volume--;
        System.out.println("--------------------------------");
        System.out.println("DIMINUINDO O VOLUME PARA: " + volume);
        System.out.println("--------------------------------");
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("-------------------------------");
        System.out.println("MUDANDO O CANAL PARA: " + novoCanal);
        System.out.println("-------------------------------");
    }
    public void aumentarCanal() {
        canal++;
        System.out.println("-------------------------------");
        System.out.println("AUMENTANDO O CANAL PARA: " + canal);
        System.out.println("-------------------------------");
    }
    public void diminuirCanal() {
        canal--;
        System.out.println("-------------------------------");
        System.out.println("DIMINUINDO O CANAL PARA: " + canal);
        System.out.println("-------------------------------");
    }
}
