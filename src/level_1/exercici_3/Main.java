package level_1.exercici_3;


public class Main {
    public static void main(String[] args) {
        if (args.length == 2 && (DirectoryListToolWrite.directoryPathExists(args[0])) != null) {
                DirectoryListToolWrite.listTree(args[0], args[1]);
        }
        else{
            System.out.println("Please provide a path to the directory");
            System.out.println("The cmd you need to write -> java level_1/exercici_3/Main level_1/exercici_3/DirectoryArgs  <outputFileName>");
        }
    }
}