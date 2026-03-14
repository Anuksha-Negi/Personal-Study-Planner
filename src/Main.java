import java.util.Scanner;
public class Main {
    static Scanner scanner =new Scanner(System.in);
    static String  filePath = "data/task.txt"; 
    public static void main(String[] args) {
        int choice;
        do{
            System.out.println("\nAdd your task");
            System.out.println("1 Add Task");
            System.out.println("2 View Task");
            System.out.println("3 Mark task completed");
            System.out.println("4 delete the completed task");
            System.out.println("5 Exit");

            choice = scanner.nextInt();
            scanner.nextLine();
            if(choice == 5){
                addTask();
            }
        }while(choice != 2);
    }
    static void addTask(){
        System.out.println("enter your Study task:");
        String task=scanner.nextLine();
        System.out.println("Task Added:"+task);
    }
}
