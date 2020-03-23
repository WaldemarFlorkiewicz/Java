package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {
    private static final int ADD_NEW_TASK = 1;
    private static final int TODO = 2;
    private static final int EXIT = 3;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Queue<Task> toDo = new PriorityQueue<Task>();
        boolean exit = true;

        do {
            try {
                printOptions();
                int options = scanner.nextInt();
                scanner.nextLine();
                switch (options) {
                    case ADD_NEW_TASK:
                        toDo.offer(addNewTask());
                        break;
                    case TODO:
                        getNewExcercise(toDo);
                        break;
                    case EXIT:
                        System.out.println("Bye bye !");
                        exit = false;
                }
            } catch (Exception e) {
                System.err.println("Try again");
                continue;
            }

        } while (exit);



    }

    private static void getNewExcercise(Queue<Task> queue) {
        if (queue.isEmpty()){
            System.out.println("Nothing to do !");
        }else {
            Task task = queue.poll();
            System.out.println("To do is : " + task);
        }
    }

    private static Task addNewTask() {
        System.out.println("Put name of Task: ");
        String nameOfTask = scanner.nextLine();
        System.out.println("Put description of Task: ");
        String descriptionOfTask = scanner.nextLine();
        System.out.println("Put priority for task: LOW, MEDIUM or HIGH");
        Priority priority = Priority.valueOf(scanner.nextLine().toUpperCase());

        Task task = new Task(nameOfTask, descriptionOfTask, priority);
        return task;
    }


    public static void printOptions() {
        System.out.println("1 - Add new exercise.");
        System.out.println("2 - TODO.");
        System.out.println("3 - Exit.");
    }


}
