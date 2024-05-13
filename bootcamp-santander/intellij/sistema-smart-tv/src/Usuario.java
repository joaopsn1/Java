public class Usuario {
    public static void main(String[] args) {

        SmartTv smarTv = new SmartTv();

        System.out.println("TV Ligada? " + smarTv.ligada);
        System.out.println("Canal Atual: " + smarTv.canal);
        System.out.println("Volume Atual: " + smarTv.volume);

        smarTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smarTv.ligada);

        smarTv.desligar();
        System.out.println("Novo Status -> TV Ligada? " + smarTv.ligada);

        smarTv.aumentarVolume();
        smarTv.aumentarVolume();
        smarTv.aumentarVolume();
        smarTv.diminuirVolume();
        System.out.println("Novo Status -> Volume Atual: " + smarTv.volume);

        smarTv.mudarCanal(24);
        System.out.println("Novo Status -> Canal Atual: " + smarTv.canal);

        smarTv.aumentarCanal();
        smarTv.diminuirCanal();
        smarTv.diminuirCanal();
        System.out.println("Novo Status -> Canal Atual: " + smarTv.canal);
    }
}