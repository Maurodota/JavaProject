import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0 ) {
            double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce valor " + valorDoce );
            mesada = mesada - valorDoce;
        }

        System.out.println("Voce gastou toda a mesada " + mesada);

    }

    private static double valorAleatorio (){
        return ThreadLocalRandom.current().nextDouble(0.5, 15);
    }

    
}
