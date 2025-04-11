import java.util.Scanner;

public class Desafio3 {
  public static void main(String[] args) {
    Scanner reading = new Scanner(System.in);

    //Número positivo ou negativo
    System.out.println("Desafio 1!");
    System.out.println("informe um número.");
    double number = reading.nextDouble();

    if(number < 0) {
      System.out.println("Número negativo!");
    }else {
      System.out.println("Número positivo!");
    }

    //Comparar inteiros
    System.out.println("Desafio 2!");
    System.out.println("Informe o primeiro número inteiro:");
    int n1 = reading.nextInt();
    System.out.println("Informe o segundo número inteiro:");
    int n2 = reading.nextInt();

    if(n1 ==  n2){
      System.out.println("Os números são iguais!");
    }else {
      System.out.println("Os números são diferentes!");
    }

    if(n1 > n2){
      System.out.println("O número " + n1 + " é maior que o número " + n2);
    }else if(n2 > n1){
      System.out.println("O número " + n2 + " é maior que o número " + n1);
    }
  }
}
