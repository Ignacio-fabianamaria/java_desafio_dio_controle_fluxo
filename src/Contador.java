import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro parâmetro");
    int primeiroParametro = scanner.nextInt();

    System.out.println("Digite o segundo parâmetro");
    int segundoParametro = scanner.nextInt();
    scanner.close();

    try {
      contar(primeiroParametro, segundoParametro);

    } catch (ParametrosInvalidosException e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }

  static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
    if (primeiroParametro > segundoParametro) {
      throw new ParametrosInvalidosException(
          "O segundo parâmetro deve ser maior que o primeiro");
    } else {
      int subtraindo = segundoParametro - primeiroParametro;
      System.out.println(
          "A subtração dos parâmetros: " + segundoParametro + " e " + primeiroParametro + " foi: " + subtraindo);
      System.out.println("Imprimindo na tela de 1 até " + subtraindo);
      for (int numero = 1; numero <= subtraindo; numero++) {
        System.out.println(numero);
      }

    }

  }
}
