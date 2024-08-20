public class smartTv {
    boolean ligada = false;
    int canal=1;
    int volume=25;

    public void ligar(){
        ligada=true;
    }

    public void desligar (){
        ligada=false;
    }

   public void aumentaVolume(){
    volume++;
   }
   public void diminuirVolume(){
    volume--;
   }

   public void aumentarCanal(){
    canal++;
   }

   public void diminuirCanal(){
    canal--;
   }
   public void definirCanal(int mudarCanal){
    canal = mudarCanal;
   }


}
