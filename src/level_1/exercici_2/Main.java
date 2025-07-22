package level_1.exercici_2;


public class Main {
    public static void main(String[] args) {
        if (args.length == 1) {
            DirectoryListTool llistador = new DirectoryListTool(args[0]);
            llistador.listTree();
        }
        else{
            System.out.println("Please provide a path to the directory");
            System.out.println("The cmd you need to write -> java level_1/exercici_2/Main level_1/exercici_2/DirectoryArgs");
        }


    }
}