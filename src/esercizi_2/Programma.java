package esercizi_2;
import java.util.Scanner;  


public class Programma {

	public static void main(String[] args) 
	{
		//int input=metodoInput("Inserisci un numero intero");
		//System.out.println(input);
		
		//esercizio5();
		esercizio6();
		//esercizio7();
	}
		// TODO Auto-generated method stub
		
		
		public static int  metodoInput (String string) 
		{
			
			Scanner userInput= new Scanner(System.in);
			System.out.println(string);
			
			int input= userInput.nextInt();
			return input;
		}
	
		public static void esercizio5() 
		{

			System.out.println("Piramide di asterischi");
			int h= metodoInput("Inserisci l'altezza della piramide");
			
			for(int i=0;i<h;i++) 
			{
				for(int k=0;k<i+1;k++) 
				{
					System.out.print('*');
				}
				
				System.out.println();
			}
		}
		
		public static void esercizio6() 
		{
			System.out.println("Confronta il sesto numero con i primi cinque");
			Integer [] numbers = new Integer [5];
			for (int i=0;i<5;i++) 
				{
					numbers[i]=metodoInput("Inserire i primi cinque numeri");
				
				}
			System.out.println("I numeri inseriti sono:");
			for (Integer i : numbers) 
				{
				  System.out.print(i+"; ");
				}
			
			System.out.println();
			
			Integer numeroConfronto=metodoInput("Iserire il numero da confrontare:");
			//Converto i numeri in stringhe
			String inputConfronto=Integer.toString(numeroConfronto);
			String[] numbersString = new String [5];
			
			for (int i=0;i<numbers.length;i++) 
				{
					numbersString[i]=Integer.toString(numbers[i]);
				}
			// metodo che conta,e stampa, i numeri cui la prima cifra è uguale a il numero di confronto
			int contatore=0;
			for (int i=0;i<numbersString.length;i++) {
					
				if(inputConfronto.substring(0,1).equals(numbersString[i].substring(0,1))) 
					{
						System.out.println(numbersString[i]);
						 contatore++;
					}
					
				}
			if(contatore==1) 
				{
					System.out.println("C'è un numero che corrisponde.");
				}
			else if(contatore>1)
				{
				System.out.println("Ci sono "+ contatore +" numeri che corrispondono.");
				}
			else 
			{
			System.out.println("Non ci sono numeri che corrispondono.");
			}
		}
		
		public static void esercizio7() 
		{
			int input=0;
			System.out.println("Rettangolo di asterischi");
			System.out.println();
			int base=metodoInput("Qual è la base?");
			System.out.println();
			int altezza=metodoInput("Qual è l'altezza?");
			System.out.println();
			
			
			if(altezza<3)
				{
					System.out.print("*");
				}
			else 
				{
					for (int i=0;i<base;i++) 
						{
							System.out.print("*");
						}
				}
			for (int n=0;n<altezza-2;n++) 
				{
					System.out.print("*");
						
					for (int k=0;k<base-2;k++) 
						{
							System.out.print("0");
						}
					System.out.print("*");
				}
			for (int n=0;n<base;n++) 
			{
				System.out.print("*");
					
			}
		}
	}

