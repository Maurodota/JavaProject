import java.util.Scanner;
/**
 * Classe ContaTerminal que simula a criação de uma conta bancária no terminal.
 * O programa solicita o nome do cliente e exibe uma mensagem de boas-vindas com
 * os dados da conta criada.
 */

public class ContaTerminal {
   
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe Scanner

        //Exibir as mensagens para o usuário

        //Obter pela Scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o nome da pessoa: ");

        String NomeCliente = sc.nextLine();
        int Numero = 1021;
        String Agencia = "067-8";
        double Saldo =237.48;
        


        System.out.println("Olá " + NomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia +", conta " + Numero + " e seu saldo "+ Saldo + " já está disponível para saque.");

       
    }
}
