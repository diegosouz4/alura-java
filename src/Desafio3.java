import java.util.Scanner;

public class Desafio3 {
  public static void main(String[] args) {
    Scanner reading = new Scanner(System.in);

    //Número positivo ou negativo
    System.out.println("Desafio 1! - Número positivo ou negativo?");
    System.out.println("informe um número.");
    double number = reading.nextDouble();

    if(number == 0) {
      System.out.println("Número é zero");
    }else if(number < 0){
      System.out.println("Número negativo!");
    }else {
      System.out.println("Número positivo!");
    }

    //Comparar inteiros
    System.out.println("Desafio 2 - Comparando números inteiros");
    System.out.println("Informe o primeiro número inteiro:");
    int n1 = reading.nextInt();
    System.out.println("Informe o segundo número inteiro:");
    int n2 = reading.nextInt();

    if(n1 == n2){
      System.out.println("Os números são iguais!");
    }else {
      System.out.println("Os números são diferentes!");
      if(n1 > n2){
        System.out.println("O número " + n1 + " é maior que o número " + n2);
      }else{
        System.out.println("O número " + n2 + " é maior que o número " + n1);
      }
    }

    //Calculando áreas
    String initialText = """
     Selecione uma das opções:
      - 1 para calcular a área do quadrado;
      - 2 para calcular a área do círculo;
    """;

    System.out.println("Desafio 3 - Calculando a área");
    System.out.println(initialText);

    int optionSelect = reading.nextInt();

    while(optionSelect != 1 && optionSelect != 2){
      System.out.println("A opção não é válida!");
      System.out.println(initialText);
      optionSelect = reading.nextInt();
    }

    if(optionSelect == 1){
      System.out.println("Informe o valor da altura do quadrado");
      double side = reading.nextInt();
      System.out.println(String.format("A área do quadrado que tem %.2f altura é: %.2f", side, (side * side) ));
    }else {
      System.out.println("Informe o valor do raio do círculo");
      double radius = reading.nextInt();
      double result = (Math.PI * (radius * radius));
      System.out.println(String.format("A área do círculo que tem %.2f raio é: %.2f", radius, result ));
    }

    //Tabuada
    System.out.println("Desafio 4 - tabuada");
    System.out.println("Informe o número inteiro para gerar a tabuada");
    int baseNumber = reading.nextInt();

    if(baseNumber == 0) {
      System.out.println("A tabuada de 0 só contém resultados 0.");
    }else{
      int nt = 0;
      System.out.println("Segue a tabuada de " + baseNumber);
      while(nt <= 10){
        System.out.println(String.format("%d x %d = %d", baseNumber, nt, (baseNumber * nt)));
        nt++;
      }
    }

    //Verificando se o número é par ou ímpar
    System.out.println("Desafio 5 - Par ou ímpar?");
    System.out.println("Informe o número inteiro para verificar se é par ou ímpar");
    int userNumber = reading.nextInt();

    if(userNumber == 0){
      System.out.println("Você escolheu o zero e ele é par");
    }else if(userNumber % 2 == 0){
      System.out.println(String.format("O número %d é par!", userNumber));
    }else {
      System.out.println(String.format("O número %d é ímpar!", userNumber));
    }

    //Calculando o fatorial
    System.out.println("Desafio 5 - Calculando o fatorial");
    System.out.println("Informe o número para gerar o fatorial");
    int userNumberChoose = reading.nextInt();
    int result = 1;

    for(int i = 1; i <= userNumberChoose; i++ ){
      result *= i;
    }

    System.out.println(String.format("O fatorial de %d é: %d", userNumberChoose, result));

    reading.close();
  }
}
