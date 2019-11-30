//tested!!!

// Stampa il pattern A) 
// dell'esercizio PrintPattern nella sezione "Nested loops" 
// del file Esercizi_00.pdf


public class Programma {

    public static void main(String[] args) {

        int lato = 8;

        for( int i=0; i < lato; i++){

            for( int j=0; j < i+1; j++){

                System.out.print("#");
            }

            System.out.println(); 
        }
    }
}
