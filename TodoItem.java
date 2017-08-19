/**
 * Class representing a single todo item.
 *
 */
public class TodoItem{
  private String name;
  private boolean isDone = false;
  
  public TodoItem(String name){
    this.name = name;
    this.isDone = isDone;
  }
  
  public String toString(){
    return name;
  }

  public void switchToIsDone(){
    isDone = true;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public void setIsDone(boolean isDone){
    this.isDone = isDone;
  }

  public boolean getIsDone(){
    return this.isDone;
  }
}

