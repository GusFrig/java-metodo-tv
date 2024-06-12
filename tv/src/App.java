public class App {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv ();
        System.out.println("A tv está ligada? " + smartTv.ligada);
        System.out.println("Qual o canal atual? " + smartTv.canal);
        System.out.println("Qual o volume atual? "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("A tv está ligada? novo status -> " + smartTv.ligada );

        smartTv.desligar();
        System.out.println("A tv está ligada? novo status -> " + smartTv.ligada );

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("volume atual é: "+ smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);

    }
    
    

}
