import java.lang.*;
import java.util.*;
public class pi{
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in); 
    System.out.println("Please put in a number for the number of decimal places in pi: ");
    int n = reader.nextInt();
    if (n > 20 || n < 0) {
      System.out.println("Too big or too small! Try again!");
      main(args);
    }
    String main = ("");
    System.out.printf("%." + n + "f\n", Math.PI);
    
    System.out.println("Would you like to continue?(y/n)");
    String check = reader.next();
    
    if (check.equals("y")) {
      main(args); 
    }
  }
}