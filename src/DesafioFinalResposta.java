import java.util.Scanner;

public class DesafioFinalResposta {
  public static void main(String[] args) {
    String user = "Anna Doe";
    String accountType = "Corrente";
    double balance = 100.00;
    int option = 0;

    Scanner reading = new Scanner(System.in);

    System.out.println("*****************************************");
    System.out.println("\nNome do cliente: " + user);
    System.out.println("Tipo da conta: " + accountType);
    System.out.println("Saldo atual: R$" + balance);
    System.out.println("\n*****************************************");

    String menuText = """
      ** Digite sua opção **
      1 - Consultar saldo
      2 - Transferir valor
      3 - Receber valor
      4 - Sair
    """;

    while(option != 4){
      System.out.println(menuText);
      option = reading.nextInt();

      switch (option){
        case 1:
          System.out.println("O saldo atualizao é R$" + balance);
          break;
        case 2:
          System.out.println("\nQual o valor que deseja transferir");
          double newTransation = reading.nextDouble();
          if(newTransation > balance){
            System.out.println("Não há saldo para realizar a transferência.");
          }else{
            balance -= newTransation;
            System.out.println("Novo saldo: R$" + balance);
          }
          break;
        case 3:
          System.out.println("Valor recebido: ");
          double reciveTransation = reading.nextDouble();
          balance += reciveTransation;
          System.out.println("Novo saldo: R$" + balance);
          break;
        default:
          System.out.println("\nValor inválido!Tente novamente\n");
      }
    }

    reading.close();
  }
}
