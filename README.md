# Desafio Controle de Fluxo  | DIO - Trilha Java Básico

## Descrição do desafio:

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console (System.out.print) dos números incrementados, exemplo:

- Se for passado os números `12 e 30`, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: `"Imprimindo o número 1"`, `"Imprimindo o número 2"` e assim por diante.
- Se o primeiro parâmetro for `MAIOR` que o segundo parâmetro, deverá ser lançadpuma exceção customizada chamada de `ParametrosInvalidosException` com a segunda mensagem: `"O segundo parâmetro deve ser maior que o primeiro"`.

## Requisitos:

-  [x] 1. Crie o projeto `DesafioControleFluxo`
-  [x] 2. Dentro do projeto, crie a classe `Contador.java` para realizar toda a codificação do nosso programa.
-  [x] 3. Dentro do projeto, crie a classe `ParametrosInvalidosException` que representará a exceção de negócio no sistema.

## Exemplo de Execução

1. Abra um terminal.

2. Navegue até o diretório onde o arquivo `Contador.java` está localizado.

3. Execute o programa usando o comando java.

4. O programa solicitará que você insira dois números inteiros. Por exemplo:

```sh
Digite o primeiro parâmetro
5
Digite o segundo parâmetro
10
```

Neste exemplo, inserimos 5 como o primeiro parâmetro e 10 como o segundo parâmetro.

5. O programa executará a função contar com os parâmetros fornecidos e imprimirá os resultados no terminal:

```sh
A subtração dos parâmetros: 10 e 5 foi: 5
Imprimindo na tela de 1 até 5
1
2
3
4
5
```

Neste exemplo, a função subtraiu 5 de 10 e, em seguida, imprimiu os números de 1 a 5.

**Lidando com exceções** - O programa lidará com exceções, se necessário. Por exemplo, se você inserir um segundo parâmetro menor que o primeiro, você receberá uma mensagem de erro:

```sh
Digite o primeiro parâmetro
10
Digite o segundo parâmetro
5
Erro: O segundo parâmetro deve ser maior que o primeiro
```
