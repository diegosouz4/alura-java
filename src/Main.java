public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o screen match");

        String movieName = "The Lord of the Rings";
        int realeseDate = 2001 ;
        boolean isIncluded = false;
        double movieScore = (9.8 + 6.3 + 8.0) / 3;
        String sinopse = "A Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.";
        int stars = (int) (movieScore / 2);

        System.out.println("Filme: " + movieName);
        System.out.println("Ano de lançamento: " + realeseDate);
        System.out.println("Filme está incluso no plano? " + isIncluded);
        System.out.println("Score do filme: " + movieScore);
        System.out.println("Sinópse do filme: " + sinopse);

        // Usando o metodo format do String.
        /*
            %s - É usado para strings;
            %d - Números inteiros;
            %f - Números flutuantes. (Podendo limitar a quantidade de casas. Colocando %.[número máximo de casas]f);
        */

        System.out.println(String.format("""
        Nome do filme: %s
        Ano de lançamento: %d
        Score: %.2f
        Stars: %d
        Sinópse: %s
        """, movieName, realeseDate, movieScore, stars, sinopse));
    }
}