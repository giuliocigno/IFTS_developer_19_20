public class CheckPassFail {

  public static void main( String[] args){
  
    int mark = 49;
    System.out.println("The mark is " + mark); 
    
    if( mark >= 0 && mark < 50 ){
    
      System.out.println("FAIL");
    
    } else if( mark >= 0 && mark < 100 ) {
   
      System.out.println("PASS");
    
    }
    System.out.println("DONE");
  }
}
