public class MediaNotas {
  public static void main(String[] args){
    double n1 = 9.2;
    double n2 = 6.3;

    System.out.println("Média das notas é: " + (n1 + n2)/2);

    //Casting double to int
    double nDouble = 9.3332323;
    int nInt = (int) nDouble;
    System.out.println("Casting double to int = " + nInt);

    //Concat chat and string
    char at = '@';
    String word = "diegosouz4";
    System.out.println(String.format("Github/%c%s", at, word));

    //Valor do produto
    double productPrice = 1400.50;
    int amount = 5;
    System.out.println("Total price: $" + productPrice * amount);

    //Conversão dolar para reais
    double dollarValue = 5.25;
    double totalInReais = dollarValue * 4.94;
    System.out.println(String.format("Valor total em Reias: R$%.2f", totalInReais));

    //Preço com desconto
    double originalPrice = 2500.00;
    double discount = 25.00;
    double finalPrice = originalPrice - ((originalPrice * discount) / 100);
    System.out.println("Valor total com desconto: R$" + finalPrice);

  }
}
