import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;

public class FileWriterDemo{
   public static void main(String[] args) throws IOException{ 
      String filename, friendName; // file name & friends name
      int numFriends; // number of friends 
      Scanner keyboard = new Scanner(System.in); // create a scanner object for keyboard input
      System.out.print("How many frieds do you have? "); // get number of friends
      numFriends = keyboard.nextInt();
      keyboard.nextLine(); // consume the remaining new line charachter
      filename = keyboard.nextLine(); // get the file name
      PrintWriter outputFile = new PrintWriter(filename); // open the file
      for (int i = 0; i <numFriends; i++){ // get the name of a friend
         System.out.print(" Enter the name of friend " + (i+1) + " :");
         friendName = keyboard.nextLine(); 
         outputFile.println(friendName); // write the name to the file 
      }
      outputFile.close(); // close the file
      System.out.print("Data written to the file.");
   }
}