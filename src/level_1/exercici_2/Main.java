package level_1.exercici_2;


public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a path to the directory");
            System.exit(1);
        }

        DirectoryListTool llistador = new DirectoryListTool(args[0]);
        llistador.listTree();
    }
}