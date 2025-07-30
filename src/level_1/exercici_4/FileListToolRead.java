package level_1.exercici_4;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;


public class FileListToolRead {


    public static File filePathExists(String path){
        File myFile = new File(path);
        if (!myFile.exists()) {
            System.out.println("Error: Directory does not exist");
            return null;
        }
        if (!myFile.isFile()) {
            System.out.println("Error: Path is not a directory.");
            return null;
        }
        return myFile;
    }

    public static void readFile(String output){

        try{
            BufferedReader file = new BufferedReader(new FileReader(output));
            String line;
            while ((line = file.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
