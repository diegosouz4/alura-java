import java.util.Scanner;

public class DesafioFinal {
  public static void main(String[] args) {
    /*
      - Desafio final
      Sumular um aplicação de banco onde o cliente tem as opções:
       - verificar saldo;
       - adicionar uma nova transferencia (valor deve ser maior que zero e tem que ter saldo para fazer);
       - receber uma nova tranferência (valor deve ser maior que zero)
       - sair do programa;
    */
    Scanner reading = new Scanner(System.in);
    String name = "Anna Doe";
    double saldo = 2500.00;
    String typeConta = "Corrente";

    System.out.println(String.format("""
    ******************************************
     Nome: %s;
     Tipo de conta: %s;
     Saldo inicial: R$ %.2f;
    ******************************************
    """,name, typeConta, saldo));

    optionsScreen(saldo, reading);
    reading.close();
  }

  static void optionsScreen(double saldo, Scanner reading){
    
    String textoOptions = """
     Operações
    
     1 - Consultar saldos
     2 - Receber valor
     3 - transferir valor
     4 - Sair
    """;

    System.out.println(textoOptions);
    int userInput = reading.nextInt();
    double newTransation = 0;

    while(userInput < 1 || userInput > 4){
      System.out.println("""
      -----------------------
        Valor inválido, tente novamente.
      -----------------------
      """);

      System.out.println(textoOptions);

      userInput = reading.nextInt();
    }

    switch (userInput){
      case 1:
        System.out.println(String.format("""
        -----------------------
        Seu saldo atual é R$ %.2f;
        -----------------------
        """, saldo));
        optionsScreen(saldo, reading);

        break;
      case 2:
        System.out.println("Informar valor a receber:");
        newTransation = reading.nextDouble();

        while(newTransation <= 0){
          System.out.println("O valor não pode ser negativo!");
          System.out.println("Insira um novo valor:");
          newTransation = reading.nextDouble();
        }

        saldo += newTransation;

        System.out.println("Saldo atualizado!");
        System.out.println("Saldo atual é de R$ " + saldo);
        optionsScreen(saldo, reading);
        break;
      case 3:
        System.out.println("Informar valor da transferência:");
        newTransation = reading.nextDouble();

        while(newTransation <= 0 || newTransation > saldo){
          if(newTransation <= 0 ){
            System.out.println("O valor não pode ser negativo!");
            System.out.println("Insira um novo valor:");
          }else{
            System.out.println(String.format("""
            -----------------------
            Saldo insuficiênte na conta!
            Seu saldo atual é R$ %.2f;
            Por favor informar um valor válido para continuar com a transação.
            -----------------------
            """, saldo));
          }

          newTransation = reading.nextDouble();
        }

        saldo -= newTransation;
        System.out.println("Saldo atualizado!");
        System.out.println("Saldo atual é de R$ " + saldo);
        optionsScreen(saldo, reading);
      default:
        System.out.println("Finalizar programa.");
    }
  };
}
