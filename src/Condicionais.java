public class Condicionais {
  public static void main(String[] args){
    int realeseDate = 2001 ;
    boolean isIncluded = false;
    double movieScore = (9.8 + 6.3 + 8.0) / 3;
    String panType = "plus";

    if(realeseDate >= 2022){
      System.out.println("Lançamentos que os clientes estão curtindo");
    }else{
      System.out.println("Filme retrô que vale a pena assistir!");
    }

    if(isIncluded || panType.equals("plus")) {
      System.out.println("Filme liberado!");
    }else {
      System.out.println("Deve pagar a mensalidade!");
    }
  }
}
