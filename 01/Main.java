import java.util.Scanner;

class Main {
  static int somarImpares(int lista[]) {

    int soma = 0;
    for(int i = 0; i < lista.length; i++) {
      if ((lista[i] % 2) != 0) {
        soma += lista[i];
      }
    }
    return soma;
  
  }
  static double mediaPares(int lista[]) {

    int soma = 0;
    int quant = 0;
    double media;

    for(int i = 0; i < lista.length; i++) {
      if ((lista[i] % 2) == 0) {
        soma += lista[i];
        quant += 1;
      }
    }
    if (quant == 0) {
      return 0;
    }
    media = (double)soma/quant;
    return media;
  
  }
  static int quantAbaixo70 (int lista[]) {

    int quant = 0;
    for(int i = 0; i < lista.length; i++) {
      if (lista[i] < 70) {
        quant++;
      }
    }
    return quant;
  
  }
  static double mediaLista(int lista[]) {

    int soma = 0;
    double media;

    for(int i = 0; i < lista.length; i++) {
        soma += lista[i];
    }
    media = (double)soma/lista.length;
    return media;
  }

  static int quantAcimaMedia(int lista[]) {
    double media = mediaLista(lista);
    int quant = 0;
    for(int i = 0; i < lista.length; i++) {
      if (lista[i] > media) {
        quant++; 
      }
    
    }
    return quant;
  }

  static boolean temNaLista(int lista[], int valor) {
    for (int i = 0; i < lista.length; i++) {
      if (valor == lista[i]) {
        return true;
      }
    }
    return false;
  }


  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Quantas notas: ");
    int quant_notas = entrada.nextInt();
    int notas[] = new int[quant_notas];

    System.out.print("Notas: ");
    for(int i = 0; i < quant_notas; i++) {
      notas[i] = entrada.nextInt();
    }

    System.out.println("\nSoma das notas impares: " + somarImpares(notas));
    System.out.println("Média das notas pares: " + mediaPares(notas));
    System.out.println("Quantidade de notas abaixo de 70: " + quantAbaixo70(notas));
    System.out.println("Quantidade de notas acima da média: " + quantAcimaMedia(notas));
    System.out.println("Tem nota 2 entra as notas? " + temNaLista(notas, 2));


  }
}
