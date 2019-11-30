//tested!!!

// Stampa il pattern F) 
// dell'esercizio PrintPattern nella sezione "Nested loops" 
// del file Esercizi_00.pdf


public class Programma {

    public static void main(String[] args) {

        int lato = 8;

        //note: each loop starts at one...
        for( int i=1; i <= lato; i++ ){

            for( int j=1; j <= lato; j++ ){

                if( i == 1 || i == lato || i == j ){

                    System.out.print("#");
                }else{

                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
