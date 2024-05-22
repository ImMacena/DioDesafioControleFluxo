import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o primeiro parâmetro: ");
    int parametroUm = Integer.parseInt(sc.nextLine());

    System.out.println("Digite o segundo parâmetro: ");
    int parametroDois = Integer.parseInt(sc.nextLine());

    sc.close();

    try {
      // chamando o método contendo a lógica de contagem
      contar(parametroUm, parametroDois);

    } catch (ParametrosInvalidosException exception) {
      System.out.println("Erro: " + exception.getMessage());
    }
  }

  static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
    if (parametroUm > parametroDois) {
      throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
    } else {
      int contagem = parametroDois - parametroUm;

      if (contagem == 0) {
        System.out.println("Não há números para contar.");
      } else {
        // realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i < contagem; i++) {
          System.out.println("Contagem: " + (i + 1));
        }
      }
    }
  }
}
