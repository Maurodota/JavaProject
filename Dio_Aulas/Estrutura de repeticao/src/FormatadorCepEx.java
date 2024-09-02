public class FormatadorCepEx {
    public static void main(String[] args) {
        try {
            String cepFormatado = fomatarCep ("23444066");
            System.out.println(cepFormatado);

        } catch (CepInvalioExeption e) {
            System.out.println("Cep invalido digite um cep com 8 numeros!");
           
            e.printStackTrace();
        }
        
    }
    static String fomatarCep(String cep) throws CepInvalioExeption{
        if(cep.length() !=8)
            throw new CepInvalioExeption();

            //simulanado um cep formatado
            return "23.444-066";
    }
}
