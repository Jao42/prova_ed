import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

class Main {
  static int calcularLedsDigito(int digit) {
    int[] leds = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
    return leds[digit];
  
  }
  static int[] integerToDigitsArray(int num) {
    String numStr = Integer.toString(num);
    int[] numArray = new int[numStr.length()];

    for(int i = 0; i < numStr.length(); i++) {
      numArray[i] = Character.getNumericValue(numStr.charAt(i));
    }
    return numArray;
    
    
  }
  static int calcularLeds(int num) {
    if (num >= 0 && num < 10) {
      return calcularLedsDigito(num);
    }

    int[] numArray = integerToDigitsArray(num);
    int quantLeds = 0;
    for (int i = 0; i < numArray.length; i++) {
      quantLeds += calcularLedsDigito(numArray[i]);
    }
    return quantLeds;

    
  }
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.print("Informe os numeros do painel que quer montar: ");
    int num = entrada.nextInt();
    int leds = calcularLeds(num);
    System.out.println("Quantidade de leds necessarios: " + leds);
  }
}
