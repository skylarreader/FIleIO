import java.io.*;
import java.nio.Buffer;

public class FileIO {
    public static void main(String[] args) {
        // Declare an array of employees
        String[] names = {"Abdi", "Chue", "Halima", "Rosa"};

        // Create an array with some names of my classmates
        String[] classmates = {"Brian", "Andre", "Alayna", "Bruk", "Ann", "Lohnel", "Chris", "Briyonna"};

        // Declare a try-catch block to catch an exception
        // that is thrown if the file cannot be created.
        try {
            // Create a new BufferedWriter to write to the file
            // Name the file output.txt
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            // Write a header to the file
            writer.write("Employee Names:\n");

            // Loop through the array of names and write each one to the file.
            for (String name : names) {
                writer.write("\n" + name);
            } //end for each loop

            // Close the file
            writer.close();
        } catch (IOException e) {
            // This catch block will catch any exceptions from creating the file.
            // If an exception is caught, then print the stack trace.
            e.printStackTrace();
        } //end try-catch

        // Create a try-catch block to catch an exception that is thrown if the file cannot be rea.
        try {
            // Create a new BufferedReader to read in the file
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));

            // Declare a string variable to hold the value of the current line of the file
            String line;

            // While there is another line in the file, read it and display it to the user
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            } //end while loop

            //close the file
            reader.close();
        } catch (IOException e) {
            // This catch block will catch and exceptions.
            // If an exception is caught, print the stack trace.
            e.printStackTrace();
        } //end try-catch

        System.out.println();

        // Declare a try-catch block to catch an exception
        // that is thrown if the file cannot be created.
        try {
            // Create a new BufferedWriter to write to the file
            // Name the file classmates.txt
            BufferedWriter writer = new BufferedWriter(new FileWriter("classmates.txt"));

            // Write a header to the file
            writer.write("Classmates' Names:\n");

            // Loop through the array of names and write each one to the file.
            for (String name : classmates) {
                writer.write("\n" + name);
            } //end for each loop

            // Close the file
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } //end try-catch

        // Declare a try-catch block to catch an exception that is thrown if the file cannot be read
        try {
            // Create a new BufferedReader to read in the file
            BufferedReader reader = new BufferedReader(new FileReader("classmates.txt"));

            // Declare a string variable to hold the value of the current line of the file
            String line;

            // While there is another line in the file, read it and display it to the user
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            } //end while loop

            // close the file
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } //end main
} //end class
