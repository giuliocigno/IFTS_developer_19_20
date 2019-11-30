// tested!!

import java.io.*;

import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class ProgrammaIO {

    public static void main( String[] args ) throws IOException {

        BufferedReader file = new BufferedReader( new FileReader( new File(/*Insert your path to a.txt*/)));
        BufferedWriter out = new  BufferedWriter( new FileWriter( new File(/*Insert your path to b.txt*/ ))); 

        String riga = file.readLine(); 

        int conto = 0; 

        while( riga != null){

            if( conto++ % 2 == 0){

                out.write( riga + "\n"); 
            }

            riga = file.readLine(); 
        }

        file.close();
        out.close(); 
    }
}
