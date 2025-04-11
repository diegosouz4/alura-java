import java.util.Scanner;

public class Loop {
  public static void main(String[] args) {
    Scanner reading = new Scanner(System.in);
    int totalScore = 0;
    double userScore = 0;
    double finalScore = 0;

    /* usando loop for
    for(int i = 0; i < 3; i++){
      System.out.println("Informe a nota " + (i + 1));
      userScore = reading.nextDouble();
      finalScore += userScore;
    }
    */

    while(userScore != -1){
      System.out.println("Informe a nota " + (totalScore + 1) + " ou digite -1 para encerrar!");
      userScore = reading.nextDouble();

      if(userScore == -1){
        System.out.println("Valor da média das " + totalScore + " notas é: " + (finalScore / totalScore));
        break;
      }else {
        finalScore += userScore;
        totalScore++;
      }
    }
  }
}
