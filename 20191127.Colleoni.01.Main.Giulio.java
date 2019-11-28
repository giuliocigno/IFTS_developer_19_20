// sample code, not tested...

public class Programma {

  public static void main(String[] args){
		  
	    List<String> strumenti = new ArrayList<>( Arrays.asList("cello","guitar","violin","double bass"));
	    
	    for( int i=0; i < strumenti.size(); i++ ){
	    
	      String element = strumenti.get(i); 
	      
	      List<Character> wordnew = new ArrayList<>();  
	      
	      for( int j=0; i < element.length(); j++ ){
	      
	          Character current = element.charAt(j); 
	      
	          if( ! isVowel( current) ){
	            
	              wordnew.add(current); 
	          }
	      }
	      
	      //removes element at position i 
	      strumenti.remove(i);
	      //adds element at position i
	      strumenti.add( i, wordnew.toString());  
	    }
	    
	    for( String element : strumenti ){
	      
	      System.out.println(element);  
	    }
	  }
	

	public static boolean isVowel( Character c ){

	   String vocali = new String("aeiou");
	   
	   if( vocali.indexOf(c) == -1 ){
	      
	      return false; 
	   
	   }else{
	   
	      return true;
	   }
	}
}
