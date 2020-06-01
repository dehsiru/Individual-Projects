package functions;

import static functions.MenuOptions.scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {

    private static LocalDate validateInput;

   
    
    public static LocalDate vadidationDate(){
        LocalDate minAcceptedDate = LocalDate.now();
        LocalDate maxAcceptedDate = LocalDate.of(2020, 8, 24);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter Date in format yyyy-mm-dd (for example 2020-02-02) :");
        
        while (true) {
            String inputDate = keyboard.next();
            try {
                LocalDate inputLocalDate = LocalDate.parse(inputDate);
                
                if (inputLocalDate.isBefore(minAcceptedDate) || inputLocalDate.isAfter(maxAcceptedDate)) {
                    System.out.println("Please enter a date in the range " + minAcceptedDate + " through " + maxAcceptedDate);
                } else { // OK
                    validateInput=inputLocalDate;
                    break;
                }
            } catch (DateTimeParseException dtpe) {
                System.out.println("Please enter a date in format yyyy-mm-dd");
            }
        } 
        return validateInput;
    }
    
    public static LocalDate isThisABirthDate(){
        LocalDate minAcceptedDate = LocalDate.of(1940, 8, 24);
        LocalDate maxAcceptedDate = LocalDate.now();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter Date in format yyyy-mm-dd: ");
        
        while (true) {
            String inputDate = keyboard.next();
            try {
                LocalDate inputLocalDate = LocalDate.parse(inputDate);
                
                if (inputLocalDate.isBefore(minAcceptedDate) || inputLocalDate.isAfter(maxAcceptedDate)) {
                    System.out.println("Please enter a date in the range " + minAcceptedDate + " through " + maxAcceptedDate);
                } else { // OK
                    validateInput=inputLocalDate;
                    break;
                }
            } catch (DateTimeParseException dtpe) {
                System.out.println("Please enter a date in format yyyy-mm-dd");
            }
        } 
        return validateInput;
    }
    
    
   public static int isThisAnInteger(){
        Scanner scan=new Scanner(System.in);
        int userInput=0,notInt=0,newInput=0;
        
       while (notInt == 0){
            String line = scan.nextLine();
            Pattern p = Pattern.compile("-?\\d+");
            if (p.matcher(line).matches()) {
                userInput = Integer.parseInt(line);
                notInt = 1;
            } else {
                System.out.println("Please try again");
            }
        }
        return userInput;
   }

  
   public static String isThisAName(){
       String input;
       input = scanner.nextLine();
       
       boolean matches = input.matches("[a-zA-Z]+");
      
       while(!matches){
            System.out.println("Give again:");
            input = scanner.nextLine();
            matches = input.matches("[a-zA-Z]+");
        }
        return input;
   }
   
   public static double isThisADouble(){
       String input;
       input = scanner.nextLine();
       
       boolean matches = input.matches("[0-9]+(.[0-9]+)?");
      
       while(!matches){
            System.out.println("Wrong! Give again: ");
            input = scanner.nextLine();
            matches = input.matches("[0-9]+.[0-9]+");
        }
        return Double.valueOf(input);
   }
    
   public static String isThisASubject(){
       String input;
       input = scanner.nextLine();
       return input;
   }
   
    public static String isThisOkForBuildSchoolInput(String input){
       
      boolean matches = input.matches("[1-5]");
      
       while(!matches){
            System.out.println("Wrong! Give again: ");
            input = scanner.nextLine();
            matches = input.matches("[1-5]");
        }
        return input;
   }
    
    public static String isThisOkForMenuInput(String input){
       
      boolean matches = input.matches("[0-9]|10|11");
      
       while(!matches){
            System.out.println("Wrong! Give again: ");
            input = scanner.nextLine();
            matches = input.matches("[0-9]|10|11");
        }
        return input;
   }
}
