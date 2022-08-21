import java.util.Scanner;

class Main {
  static double calcPrecoKg(double preco, int pesoGrama) {
    double precoKg = 0;
    precoKg = (1000.0 / pesoGrama) * preco;

    return precoKg;
  }
  static int doceMaisBarato(double[] precosKg) {
    double min = precosKg[0];
    int doceMaisBarato = 1;
    for(int i = 1; i < precosKg.length; i++) {
      if(precosKg[i] < min) {
        min = precosKg[i];
        doceMaisBarato = i + 1;
      }
    }
    return doceMaisBarato;
  }
  static int pesoTotal(int[] pesosGrama) {
    int pesoTotal = 0;
    for (int i = 0; i < pesosGrama.length; i++) {
      pesoTotal += pesosGrama[i];
    }
    return pesoTotal;
  }
  static double gastoTotal(double[] precos) {
    double gastoTotal = 0;
    for (int i = 0; i < precos.length; i++) {
      gastoTotal += precos[i];
    }
    return gastoTotal;
  }

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Total de doces comprados: ");

    int quantDoces = entrada.nextInt();
    int[] pesos = new int[quantDoces];
    double[] precos = new double[quantDoces];
    double[] precosKg = new double[quantDoces];

    int peso;
    double preco;
    double precoKg;
    for (int i = 0; i < quantDoces; i++) {
      System.out.println("Doce " + (i+1) + ":");
      System.out.print("Peso (g):");
      peso = entrada.nextInt();
      System.out.print("Preço (R$): ");
      preco = entrada.nextDouble();

      precoKg = calcPrecoKg(preco, peso); 
      System.out.println("Preço unitário = R$" + precoKg + "/kg");

      pesos[i] = peso;
      precos[i] = preco;
      precosKg[i] = precoKg;
      
    }
    int doceBarato = doceMaisBarato(precosKg);
    System.out.println("\nProduto mais barato: Doce "
        + doceBarato 
        + ", R$"
        + precosKg[doceBarato - 1]
        + "/kg"
    );

    double gasto = gastoTotal(precos);
    int gramas = pesoTotal(pesos);

    System.out.println("Foram comprados " + gramas + "g de doce por R$" + gasto);

    

  }
}
