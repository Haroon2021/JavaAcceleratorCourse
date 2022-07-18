// import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 
import java.time.LocalTime; 
class Clock {
    public static final String ANSI_RED = "\u001B[41m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {
        
        LocalTime myObj = LocalTime.now();
        DateTimeFormatter myObjTest = DateTimeFormatter.ofPattern("HH:mm");
        String formattedDate = myObj.format(myObjTest);

        System.out.println("The current time " + ANSI_RED + "time" + ANSI_RESET + " is: " + formattedDate);

    }

    
}