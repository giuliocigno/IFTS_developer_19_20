//tested!!!

//Pattern B) dell'esercizio PrintPattern del file Esercizi_00.pdf

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
