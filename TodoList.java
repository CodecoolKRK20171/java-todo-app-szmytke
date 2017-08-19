import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class representing a todo list.
 * TodoList object should aggregate TodoItem objects.
 */
public class TodoList{
  private ArrayList<TodoItem> toDoList;
  public TodoList(){
    toDoList = new ArrayList<TodoItem>();

  }
  public void addItem(String name){
    toDoList.add(new TodoItem(name));
  }

  public void printList(){
    int counter = 1;
    for (TodoItem item : toDoList){
      
      if (item.getIsDone() == true){
        
        System.out.println(String.format("%d [x] %s", counter, item.getName()));
      }
      else{
        System.out.println(String.format("%d [ ] %s", counter, item.getName()));
      }

      counter += 1;
      
    }
  }
  public  void setTodoList(ArrayList<TodoItem> toDoList){
    this.toDoList = toDoList;
  }

  public ArrayList<TodoItem> getTodoList(){
    return this.toDoList;
  }

  public void markTodoItem(int choosenIndex){
    int realChoosenIndex = choosenIndex - 1;
    for (int i = 0 ; i < toDoList.size(); i++){
      if (realChoosenIndex == i){
        if (toDoList.get(i).getIsDone() == false){
          toDoList.get(i).setIsDone(true);
        }
      }
    }
  }
  public void archiveTodoList(){
    Iterator<TodoItem> i = toDoList.iterator();
    while (i.hasNext()) {
      TodoItem task = i.next();
      if (task.getIsDone() == true){
        i.remove();
      }
    }
  }
}
