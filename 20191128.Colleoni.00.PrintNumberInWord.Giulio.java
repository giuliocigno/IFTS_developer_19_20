//sample code, not tested...
public class PrintNumberInWord {

  public static void main( String[] args) {
  
    int number = 5; 
    
    //nested if...
   
    if( number == 1 ){
      
      System.out.println("UNO");
      
    } else if() {
      
      System.out.println("DUE");
            
    } else if() {
    
      System.out.println("TRE");
    
    } else if() {
    
      System.out.println("QUATTRO");
    
    } else if() {
    
      System.out.println("CINQUE");
    
    } else if() {
    
      System.out.println("SEI");
    
    } else if() {
    
      System.out.println("SETTE");
    
    } else if() {
    
      System.out.println("OTTO");
    
    } else if() {
    
      System.out.println("NOVE");
    
    } else {
    
      System.out.println("ALTRO");
    }
  
    //switch construct
  
    switch( number){
  
      case 1: System.out.println("UNO"); break;
      case 2: System.out.println("DUE"); break;
      case 3: System.out.println("TRE"); break;
      case 4: System.out.println("QUATTRO"); break;
      case 5: System.out.println("CINQUE"); break;
      case 6: System.out.println("SEI"); break;
      case 7: System.out.println("SETTE"); break;
      case 8: System.out.println("OTTO"); break;
      case 9: System.out.println("NOVE"); break;
      default: System.out.println("ALTRO");
  
    }
  }
}
