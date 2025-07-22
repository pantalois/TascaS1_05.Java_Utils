package level_1.exercici_1;


public class Main {
    public static void main(String[] args) {

        if (args.length == 1) {
            AlphabeticList.AlphabeticListOrder(args[0]);
        } else {
            System.out.println("Error receiving the directory path");
            System.out.println("The cmd you need to execute -> java level_1/exercici_1/Main level_1/exercici_1/DirectoryArgs");
        }

    }
}
