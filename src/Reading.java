import java.util.Scanner;

public class Reading {
  public static void main(String[] args) {
    Scanner reading = new Scanner(System.in);

    System.out.println("Informe seu filme favorito");
    String movie = reading.nextLine();

    System.out.println("Qual foi o ano de lançamento?");
    int realeaseYear = reading.nextInt();

    System.out.println("Qual a sua nota para o filme " + movie + "?" );
    double userScore = reading.nextDouble();

    System.out.println(String.format("""
    Nome do filme: %s;
    Ano de lançamento: %d;
    Nota do usuário: %.2f;
    """, movie, realeaseYear, userScore));
  }
}
