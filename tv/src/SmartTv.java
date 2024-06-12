public class SmartTv{
    boolean ligada= true;
    int canal = 1;
    int volume= 25;
     
    public void aumentarVolume(){
        volume++;
        System.out.println("O volume está aumentando para" + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("O volume está diminuindo para" + volume);
    }

    public void ligar(){
        ligada = true;        
    }

    public void desligar(){
        ligada = false;        
    }

    public void subirCanal(){
        canal++;
        
    }

    public void descerCanal(){
        canal--;
        
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    
}
