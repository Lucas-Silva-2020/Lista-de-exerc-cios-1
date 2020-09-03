import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    float valorPago = 0;
    float valorProduto = 0;
    System.out.printf("Informe o valor pago (R$): ");
    valorPago = ler.nextFloat();
    System.out.printf("Informe o valor do produto (R$): ");
    valorProduto = ler.nextFloat();
    System.out.printf("O valor do troco é de R$%f", (valorPago - valorProduto));
  }
}