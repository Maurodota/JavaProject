public class AulaArray {
    public static void main(String[] args) {
        String Equipamentos [] = {"DESKTOP", "NOTEBOOK", "MOUSE", "MONITOR", "TELEFONE", "SWITCHES"};
        /* Codigo 1
        for (int x=0; x < Equipamentos.length; x++ )  {
            
            System.out.print(" O Equipamento no indice x=" + x + " é " + Equipamentos [ x ]);
        }*/

        /*Codigo 2 Interação de uma versão mais limpa do codigo */

        for ( String Equipamento : Equipamentos){
            System.out.println("Equipamento " + Equipamento);

        }
    }

}