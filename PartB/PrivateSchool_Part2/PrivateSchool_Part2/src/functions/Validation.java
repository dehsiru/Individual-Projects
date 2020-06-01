package functions;

import static functions.MenuOptions.scanner;

public class Validation {
    
    
        
    public static String isThisOkForMenuInput(String input){
       
      boolean matches = input.matches("[0-9]|10|11|12|13|14|15|16");
      
       while(!matches){
            System.out.println("Next input, type here: ");
            input = scanner.nextLine();
            matches = input.matches("[0-9]|10|11|12|13|14|15|16");
        }
        return input;
   }

}
