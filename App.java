import java.util.Scanner;

/**
 * Class representing the TodoApp application.
 * It is the main entry point for this program.
 */
public class App{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String userChoose;
    String closeApp;

    TodoList listToDo = new TodoList();

    do {
      System.out.println("Type what you want to do[list, add, mark, archive]:");
      userChoose = input.nextLine();

      if (userChoose.equals("add")) {
        System.out.print("Add an item:");
        String todoTask = input.nextLine();
        listToDo.addItem(todoTask);
      }
      else if (userChoose.equals("list")){
        System.out.println("You saved the following to-do items:");
        listToDo.printList();
      }
      else if (userChoose.equals("mark")){
        System.out.println("Which one you want to mark as completed:");
        int todoItemToMark = input.nextInt();
        listToDo.markTodoItem(todoItemToMark);
      }
      else if (userChoose.equals("archive")){
        listToDo.archiveTodoList();
        System.out.println("All completed tasks got deleted.");
      }
      System.out.print("If you want to close the application, type: 'exit' or press enter to stay: ");
      closeApp = input.nextLine();
    }
    while (!closeApp.equals("exit"));
  input.close();
  }
}
