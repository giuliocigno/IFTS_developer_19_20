// tested!!

import java.io.*;

import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class ProgrammaIO {

    public static void main( String[] args ) throws IOException {

        BufferedReader file1 = new BufferedReader( new FileReader( new File(/*Insert your path to f1.txt*/)));   /*Insert your path to a.txt*/         
        BufferedReader file2 = new BufferedReader( new FileReader( new File(/*Insert your path to f2.txt*/))); 

        BufferedWriter out = new BufferedWriter( new FileWriter( new File(/*Insert your path to unione.txt*/))); 
        
        String riga = file1.readLine(); 

        while( riga != null ){

            out.write( riga + "\n"); 
            riga = file1.readLine(); 
        }

        // inizia il secondo file 
        riga = file2.readLine(); 

        while( riga != null ){

            out.write( riga + "\n"); 
            riga = file2.readLine(); 
        }


        file1.close();
        file2.close(); 
        out.close(); 
    }
}
