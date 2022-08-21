import java.util.Scanner;

class Main {
  static double somaFrac(int num) {
    double soma = 0;
    for(int i = 1; i <= num; i++) {
      soma += 1.0/i;
    
    }
    return soma;
  }

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int num = entrada.nextInt();
    System.out.println(somaFrac(num));

  }
}
