import java.util.Scanner;

/**
 *This program prints out how mnay stars the user wants
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner
    Scanner input = new Scanner(System.in);
    
    //asks user for number of stars
    System.out.println("Please enter a number between 1 and 10");
    //users number
    int usersNumber = input.nextInt();
    //variable for star
    String star = ("*");
    
    //for loop to count up printing stars
    for (int i = 1; i <= usersNumber; i++){
        //prints stars on one line
        System.out.print(star + " ");
        
    }
    
    
  }
}
