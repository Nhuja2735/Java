import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("==== File Reader Application ====");
        System.out.println("1. Read text file");
        System.out.println("2. Exit");
        System.out.print("Select an option: ");
        
        try {
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (choice) {
                case 1:
                    readFile(scanner);
                    break;
                case 2:
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Invalid option selected.");
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input detected.");
        } finally {
            scanner.close();
        }
    }

    private static void readFile(Scanner scanner) {
        System.out.print("Enter the path to the text file: ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("Error: File does not exist.");
            return;
        }
        if (!file.isFile()) {
            System.out.println("Error: The specified path does not point to a file.");
            return;
        }
        if (!file.canRead()) {
            System.out.println("Error: Cannot read file. Permission denied or file is locked.");
            return;
        }
        
        // Attempt to read file
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            System.out.println("\nFile content:");
            System.out.println("-------------");
            
            String line;
            boolean emptyFile = true;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                emptyFile = false;
            }
            
            if (emptyFile) {
                System.out.println("(File is empty)");
            }
            
            System.out.println("-------------");
            System.out.println("File read successfully.");
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found (race condition detected).");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred while reading the file.");
            System.out.println("Details: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred.");
            System.out.println("Details: " + e.getMessage());
        }
    }