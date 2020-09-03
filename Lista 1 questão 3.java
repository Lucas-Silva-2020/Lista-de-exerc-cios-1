import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    float pesoPeixe = 0;
    float excesso = 0;
    float multa = 0;
    Scanner ler = new Scanner(System.in);
    System.out.printf("Informe o peso total de peixes (KG): ");
    pesoPeixe = ler.nextFloat();
    if (pesoPeixe > 50) {
      excesso = (pesoPeixe - 50);
      multa = (excesso * 4);
      System.out.printf("\n o excesso foi de %2f quilos e a multa é de R$%f", excesso, multa);
    }
  }
}