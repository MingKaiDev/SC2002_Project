package utils;
import java.io.File;  // Import the File class
import java.io.IOException;


/**
 *Class responsible for file creation related methods
 */
public class TextFileCreator {
    /**
     * creates new a file
     * @param FILE_PATH
     */
    public static void createFile(String FILE_PATH){
        File file = new File(FILE_PATH);
        if (file.exists()) {
            return;
        }
        try {
            File myObj = new File(FILE_PATH);
            if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
            } else {
            System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
