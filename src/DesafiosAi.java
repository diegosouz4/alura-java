import java.util.Scanner;

public class DesafiosAi {
  public static void main(String[] args) {
    Scanner reading = new Scanner(System.in);
    //1 - Conversor de temperatura
    /* Converter a temperatura de Celsius para Fahrenheit */
    System.out.println("Digite a temperatura em Celsius.");
    double cTemp = reading.nextDouble();
    double fTemp = (cTemp * 9.0 / 5) + 32;
    System.out.println(String.format("O valor %.2f C em Fahrenheit é de %.2f F.", cTemp, fTemp));

    //2 - Média de notas
    double totalNotas = 0;
    double nota = 0;
    double mediaNotas = 0;

    for(int i = 0; i < 3; i++){
      System.out.println("Digite a nota " + (i + 1));
      nota = reading.nextDouble();
      totalNotas += nota;
    }

    mediaNotas = totalNotas / 3;

    if(mediaNotas >= 7) {
      System.out.println("Aluno aprovado!");
    }else if(mediaNotas >=5){
      System.out.println("Aluno está de recuperação!");
    }else{
      System.out.println("Aluno reprovado!");
    }

    //3 - Contador de pares e ímpares:
    System.out.println("Descubra quantos números pares e ímpares tem do número 1 até o que digitar.");
    System.out.println("Digite um número de 1 até 100.");
    int maxValue = reading.nextInt();
    int i = 1;
    int totalPares = 0;
    int totalImpares = 0;

    while(maxValue < 1 || maxValue > 100) {
      System.out.println("O valor precisa estar entre 1 e 100");
      System.out.println("Informe um novo valor");
      maxValue = reading.nextInt();
    }

    while(i <= maxValue){
      if(i % 2 != 0){
        totalImpares++;
      }else{
        totalPares++;
      }
      i++;
    }

    System.out.println(String.format("""
    Do número 1 até %d têm %d números pares e %d números ímpares.
    """, maxValue, totalPares, totalImpares));

    // 4 - Jogo adivinhação
    System.out.println("Tente adivinahr o número da sorte. Informe um valor entre 1-100.");
    int randomNumber = (int) (Math.random() * 101);
    int currentNumber = 0;
    int tentativas = 1;

    while(currentNumber != randomNumber){
      currentNumber = reading.nextInt();

      if(currentNumber == randomNumber) {
        System.out.println("Você acertou o número secreto! Levou " + tentativas + "tentativas.");
        break;
      }

      if(currentNumber > randomNumber) {
        System.out.println("O número secreto é menor que " + currentNumber);
      }else{
        System.out.println("O número secreto é maior que " + currentNumber);
      }

      tentativas++;
    }

    reading.close();
  }
}
