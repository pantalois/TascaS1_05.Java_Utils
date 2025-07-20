package level_1.exercici_4;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;


public class DirectoryListToolRead{


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

    public static void listTree(String path, String output) {
        int level = -1;
        try (PrintWriter writer = new PrintWriter(new FileWriter(output))) {
            listRecursive(new File(path), writer);
            System.out.println("Directory tree saved to " + output);

        } catch (IOException e) {
            System.err.println("Directory write failed: " + e.getMessage());
        }
        readFile(output);
    }


    private static void listRecursive(File dir, PrintWriter writer) {
        File[] elements = dir.listFiles();
        if (elements == null) return;

        Arrays.sort(elements, Comparator.comparing(File::getName));

        for (File element : elements) {

            String type = element.isDirectory() ? "D" : "F";

            String dataMod = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                    .format(new Date(element.lastModified()));

            writer.println(type + " " + element.getName() + dataMod);


            if (element.isDirectory()) {
                listRecursive(element, writer);
            }
        }
    }
}
