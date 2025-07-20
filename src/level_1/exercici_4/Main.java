package level_1.exercici_4;


public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java level_1/exercise3.Main <directory-path> <output-file>");
            System.exit(1);
        }

        DirectoryListToolRead.listTree(args[0], args[1]);
    }
}