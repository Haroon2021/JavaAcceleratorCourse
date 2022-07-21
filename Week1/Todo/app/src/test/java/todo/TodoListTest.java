package todo;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class TodoListTest {
    @Test public void testStartsWithEmptyTodo() {
        TodoList todos = new TodoList();
        ArrayList<String> tasks = todos.getTasks();
        assertTrue("Initialise an array of strings", tasks.isEmpty());        
    }

    @Test public void testAddNewNote() {
        TodoList todos = new TodoList();
        todos.addTask("Test task"); 
        ArrayList<String> tasks = todos.getTasks();
        assertEquals("Adds a task as a string to the array",String.valueOf("Test task"), tasks.get(0));        
    }
}
