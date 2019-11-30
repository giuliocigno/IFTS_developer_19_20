// tested!!

import java.io.*;

import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class ProgrammaIO {

    public static void main( String[] args ) throws IOException {

        BufferedReader file = new BufferedReader( new FileReader( new File("/*Insert your path to a.txt*/"))); 
        BufferedWriter out = new  BufferedWriter( new FileWriter( new File("/*Insert your path to b.txt*/"))); 

        String riga = file.readLine(); 

        int conto = 0; 
        int caratteri = 0; 

        while( riga != null){

            conto++ ;
            
            //somma i caratteri della riga corrente 
            caratteri += riga.length(); 

            riga = file.readLine(); 
        }


        out.write(  "Numero righe lette: " + conto + "\nNumero caratteri letti: " + caratteri); 

        file.close();
        out.close(); 
    }
}
