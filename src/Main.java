import java.util.Scanner;
public class Main {
    static Scanner scanner =new Scanner(System.in);
    static String  filePath = "data/task.txt"; 
    public static void main(String[] args) {
        int choice;
        do{
            System.out.println("\nAdd your task");

            System.out.println("1 Add Task");
            System.out.println("2 Exit");

            choice = scanner.nextInt();
        }while(choice != 2);
    }
}
