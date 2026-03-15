import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class Main {
    static Scanner scanner =new Scanner(System.in);
    static String  filePath = "data/task.txt"; 
    public static void main(String[] args) {
        int choice;
        do{
            System.out.println("\n--- Personal Study Planner ---");
            System.out.println("1 Add Task");
            System.out.println("2 View Task");
            System.out.println("3 Mark task completed");
            System.out.println("4 delete the completed task");
            System.out.println("5 Exit");

            choice = Integer.parseInt(scanner.nextLine());
            switch(choice){
                case 1:
                    addTask();
                    break;
                case 2:
                    ViewTasks();
                    break;
                case 3:
                    MarkCompleted();
                    break;
                case 4:
                    DeleteCompletedTask();
                    break;
                case 5:
                    System.out.println("exit study planner.");
                    break;
                default:
                    System.out.println("invalid choice");
            }
        }while(choice != 5);
    }
    static void addTask(){
        System.out.println("enter your Study task:");
        String task=scanner.nextLine();
        System.out.println("Enter notes:");
    String notes = scanner.nextLine();

    try{

        FileWriter writer = new FileWriter(filePath, true);
        writer.write(task + " | " + notes + " | Pending\n");
        writer.close();

        System.out.println("Task Added Successfully!");

    }catch(Exception e){

        System.out.println("Error saving task");

    }

    }
    static void ViewTasks(){
        try{

        File file = new File(filePath);
        Scanner fileScanner = new Scanner(file);

        int i = 1;

        while(fileScanner.hasNextLine()){

            System.out.println(i + ". " + fileScanner.nextLine());
            i++;

        }

        fileScanner.close();

    }catch(Exception e){

        System.out.println("No tasks found.");

    }
    }
    static void MarkCompleted(){
        System.out.println("the task is completed.");
    }
    static  void DeleteCompletedTask(){
        System.out.println("deleting completed task...");
    }
}
