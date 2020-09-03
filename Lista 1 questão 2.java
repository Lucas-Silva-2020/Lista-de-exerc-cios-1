import java.lang.Math;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    double valorA = 0;
    double valorB = 0;
    double valorC = 0;
    double valorDelta = 0;
    double valorX = 0;
    double valorX1 = 0;
    double valorX2 = 0;
    System.out.printf("Informe o valor de A: ");
    valorA = ler.nextInt();
    System.out.printf("Informe o valor de B: ");
    valorB = ler.nextInt();
    System.out.printf("Informe o valor de C: ");
    valorC = ler.nextInt();
    valorDelta = ((valorB * valorB) - (4 * valorA * valorC));
    System.out.printf("O valor do delta é %2f", valorDelta, "\n");
    if (valorDelta == 0) {
      valorX = (((valorB * -1) + (Math.pow(valorDelta, 0.5))) / (2 * valorA));
      System.out.printf("\nA equação tem solução única: %2f",valorX);
    }
    else if (valorDelta < 0) {
      System.out.printf("\nA equação não tem solução real.");
    }
    else if (valorDelta > 0) {
      valorX1 = (((valorB * -1) + (Math.pow(valorDelta, 0.5))) / (2 * valorA));
      valorX2 = (((valorB * -1) - (Math.pow(valorDelta, 0.5))) / (2 * valorA));
      System.out.printf("\nA equação tem duas soluções: %2f e %2f", valorX1, valorX2);
    }
  }
}