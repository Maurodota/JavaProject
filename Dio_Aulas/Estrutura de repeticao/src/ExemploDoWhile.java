import java.util.Random;

public class ExemploDoWhile {

    public static void main(String[] args) {
        System.out.println("Discando");
        do{
            System.out.println("Telefone Tocando");
        }while (Tocando());
        System.out.println(" Alô ");
    }
    private static boolean Tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        // Negando o Ato de continuar Tocando.
        return ! atendeu;
    }
}