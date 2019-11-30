//tested!!!

// Stampa il pattern B) 
// dell'esercizio PrintPattern nella sezione "Nested loops" 
// del file Esercizi_00.pdf

public class Programma {

    public static void main(String[] args) {

        int lato = 8;

        for( int i=0; i < lato; i++){

            for( int j=0; j < lato - i; j++){

                System.out.print("#");
            }

            System.out.println(); 
        }
    }
}
