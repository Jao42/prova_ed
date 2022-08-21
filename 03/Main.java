import java.util.Arrays;
import java.util.Scanner;

class Main {

  static int[] concatIntArray(int a[], int b[]) {
    int[] concat = new int[a.length + b.length];

    for(int i = 0; i < a.length; i++) {
      concat[i] = a[i];
    }
    for(int i = 0; i < b.length; i++) {
      concat[i + a.length] = b[i];
    }

    return concat;
  
  }
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Tamanho do primeiro array: ");
    int tam_a = entrada.nextInt();
    int[] a = new int[tam_a];
    System.out.print("Elementos primeiro array: ");
    for (int i = 0; i < tam_a; i++) {
      a[i] = entrada.nextInt();
    
    }
    System.out.println("Primeiro array: " + Arrays.toString(a));

    System.out.print("\nTamanho do segundo array: ");
    int tam_b = entrada.nextInt();
    int[] b = new int[tam_b];
    System.out.print("Elementos segundo array: ");
    for (int i = 0; i < tam_b; i++) {
      b[i] = entrada.nextInt();
    
    }
    System.out.println("Segundo array: " + Arrays.toString(b));


    int[] c = concatIntArray(a, b);
    System.out.println("\nConcatenados: " + Arrays.toString(c));


  }
}
