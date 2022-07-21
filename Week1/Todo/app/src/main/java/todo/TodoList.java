package todo;

import java.util.ArrayList;

public class TodoList {
    public static void main(String[] args){
        
    }

    private ArrayList<String> tasks = new ArrayList<String>();

    public ArrayList<String> getTasks(){
        return this.tasks;
    }

    public void addTask(String task){
        this.tasks.add(task);
    }
    
}

