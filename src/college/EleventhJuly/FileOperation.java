package  college.EleventhJuly;


import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileOperation {
    public static void main(String[] args) {
        String fileName = "example.txt";

        // 1. Create and Write to the file
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello from Java file operations!\n");
            writer.write("This is a second line.");
            writer.close();
            System.out.println("✅ File written successfully.");
        } catch (IOException e) {
            System.out.println("❌ Error writing to file.");
            e.printStackTrace();
        }

        // 2. Read from the file
        try {
            FileReader fr = new FileReader(fileName);
            Scanner sc = new Scanner(fr);

            System.out.println("📖 Reading file contents:");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("❌ Error reading the file.");
            e.printStackTrace();
        }
    }
}
