public class usuario {
    public static void main(String[] args) throws Exception {
        smartTv smartTv = new smartTv();

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status ->  TV ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status ->  TV ligada ? " + smartTv.ligada);

        smartTv.aumentaVolume();
        smartTv.aumentaVolume();
        smartTv.aumentaVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        // System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.definirCanal(13);
        System.out.println("Canal definido: "+ smartTv.canal);
    }
}
