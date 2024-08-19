package edu.dota.primeiraSemana;

public class tiposVariaveis {
    public static void main(String[] args) throws Exception{

        byte numero = 44; /*Armazena numeros inteiros de -128 a 127 */

        short dataNasc = 2001;/*Armazena números inteiros de -32.768 a 32.767 */

        int cep = 32465098;/*Armazena números inteiros de -2.147.483.648 a 2.147.483.647 */

        long cpf = 22222222222L; /*Armazarna números inteiros longos (Colocar o 'L' no final) */

        float valordePi = 3.14159f;/*Armazena fracionarios de 6 a 7 dígitos decimal (colocar "F" no final, caso contrario ele converte em DOUBLE)*/
       
        double salarioMinimo = 3200.00;/*Armazena fracionarios de 15 a 16 dígitos decimais. */

        /*No caso do INT E DO LONG, caso o numero começe com 0, poode ser necessario converter em uma STRING */

        /*Caso queira travar o valor para que ele nunca mude */
        final int NUMERO1 = 2;
        
        System.out.print ("Numero" + NUMERO1);
      
          
    }
}
    

