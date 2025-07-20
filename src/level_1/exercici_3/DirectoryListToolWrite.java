package level_1.exercici_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;


public class DirectoryListToolWrite {


    public static void listTree(String path, String output) {
        int level = -1;
        try (PrintWriter writer = new PrintWriter(new FileWriter(output))) {
            listRecursive(new File(path), level + 1, writer);
            System.out.println("Directory tree saved to " + output);

        } catch (IOException e) {
            System.err.println("Directory write failed: " + e.getMessage());
        }
    }


    private static void listRecursive(File dir, int level, PrintWriter writer) {
        File[] elements = dir.listFiles();
        if (elements == null) return;

        Arrays.sort(elements, Comparator.comparing(File::getName));

        for (File element : elements) {

            String type = element.isDirectory() ? "D" : "F";

            String dataMod = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                    .format(new Date(element.lastModified()));

            writer.println(dataMod + " " + type + " " + element.getName());

            System.out.println(" ".repeat(level * 4) +
                    type + " " + element.getName() +
                    " - Last modification: " + dataMod);

            if (element.isDirectory()) {
                listRecursive(element, level + 1, writer);
            }
        }
    }
}
