package level_1.exercici_2;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.text.SimpleDateFormat;


public class DirectoryListTool {

    private final File directori;

    public DirectoryListTool(String path) {
        this.directori = new File(path);
    }

    public void listTree() {
        if (!directori.exists()) {
            System.out.println("Error: Directory does not exist");
            return;
        }
        if (!directori.isDirectory()) {
            System.out.println("Error: Path is not a directory.");
            return;
        }

        listRecursive(directori, 0);
    }

    private void listRecursive(File dir, int level) {
        File[] elements = dir.listFiles();
        if (elements == null) return;

        Arrays.sort(elements, Comparator.comparing(File::getName));

        for (File element : elements) {

            String type = element.isDirectory() ? "D" : "F";

            String dataMod = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                    .format(new Date(element.lastModified()));

            System.out.println(" ".repeat(level * 4) +
                    type + " " + element.getName() +
                    " - Last modification: " + dataMod);

            if (element.isDirectory()) {
                listRecursive(element, level + 1);
            }
        }
    }
}
