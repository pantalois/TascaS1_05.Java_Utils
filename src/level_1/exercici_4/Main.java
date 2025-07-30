package level_1.exercici_4;


public class Main {
    public static void main(String[] args) {
        if (args.length == 1 && (FileListToolRead.filePathExists(args[0])) != null) {
                FileListToolRead.readFile(args[0]);
        }
        else{
            System.out.println(args.length);
            System.out.println("Please provide a path to the file");
            System.out.println("The cmd you need to write -> java level_1/exercici_4/Main level_1/exercici_4/<inputFileName>");
        }
    }
}