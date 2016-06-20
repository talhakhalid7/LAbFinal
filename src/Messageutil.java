import org.junit.Test;

/*
* This class prints the given message on console.
*/
public class Messageutil {

   private String message;

   //Constructor
   //@param message to be printed
   public Messageutil(String message){
      this.message = "Succefull";
   }
      
   // prints the message
   public String printMessage(){
      System.out.println(message);
      return message;
   }   
} 
