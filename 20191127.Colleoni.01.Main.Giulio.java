// sample code, not tested...

public class Programma {

  public static void main(){
  
    List<String> strumenti = new ArrayList<>( Arrays.asList("cello","guitar","violin","double bass"));
    
    for( int i=0; i < strumenti.size(); i++ ){
    
      element = strumenti.get(i); 
      
      List<char> wordnew = new ArrayList<>();  
      
      for( int i=0; i < element.lenght; i++ ){
      
          current = element.charAt(i); 
      
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
}

public static boolean isVowel( char c ){

   String vocali = new String("aeiou");
   
   if( vocali.indexOf(c) == -1 ){
      
      return false; 
   
   }else{
   
      return true;
   }
}
