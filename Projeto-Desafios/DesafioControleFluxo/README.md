
### Descrição do Projeto: Desafio de Controle de Fluxo

Este projeto foi desenvolvido para praticar o conteúdo de controle de fluxo em Java, incluindo a utilização de exceções personalizadas, estruturas de repetição e condicionais.

#### Objetivo

O objetivo do projeto é criar um sistema que receba dois parâmetros via terminal e imprima uma sequência de números incrementados com base na diferença entre esses dois valores. Caso o primeiro parâmetro seja maior ou igual ao segundo, uma exceção personalizada será lançada para informar o usuário de que a entrada é inválida.

#### Funcionalidades

1. **Recebimento de parâmetros**: O sistema recebe dois números inteiros via terminal, representando os limites de uma sequência numérica.
2. **Validação de parâmetros**: O sistema verifica se o segundo parâmetro é maior que o primeiro. Caso contrário, uma exceção personalizada (`ParametrosInvalidosException`) é lançada.
3. **Impressão da sequência**: Se os parâmetros forem válidos, o sistema imprime no console os números incrementados entre o primeiro e o segundo valor.
4. **Tratamento de Exceções**: O sistema trata exceções com uma mensagem personalizada, garantindo a robustez do código.

#### Estrutura do Projeto

- **Classe `Contador`**: Contém a lógica principal do programa. Ela solicita os dois números ao usuário, valida a entrada, executa o loop de impressão e trata as exceções.
- **Classe `ParametrosInvalidosException`**: Representa uma exceção personalizada que é lançada quando o segundo parâmetro fornecido não é maior que o primeiro. Isso garante a integridade dos dados processados.

#### Exemplo de Execução

- Entrada: 
  ```
  Digite o primeiro parâmetro: 10
  Digite o segundo parâmetro: 15
  ```

- Saída:
  ```
  Imprimindo o número 1
  Imprimindo o número 2
  Imprimindo o número 3
  Imprimindo o número 4
  Imprimindo o número 5
  ```

- Entrada Inválida:
  ```
  Digite o primeiro parâmetro: 15
  Digite o segundo parâmetro: 10
  ```

- Saída de erro:
  ```
  O segundo parâmetro deve ser maior que o primeiro
  ```

#### Tecnologias Utilizadas

- **Java SE**: Linguagem de programação utilizada para codificação.
- **IDE**: O projeto foi desenvolvido e testado em uma IDE Java (por exemplo, IntelliJ IDEA ou Eclipse).

#### Aprendizados

- Manipulação de exceções personalizadas.
- Uso de laços de repetição como `for`.
- Validação de entrada de dados.
- Tratamento de fluxo de controle em Java.

