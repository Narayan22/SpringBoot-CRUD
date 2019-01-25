package com.example.demo.controller;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

	private  List<TodoModel> todos = new ArrayList<TodoModel>();
	private static int todoCount = 3;
	public TodoService() {
		todos.add(new TodoModel(1, "narayan", "Learn Spring MVC", new Date(),
				false));
		todos.add(new TodoModel(2, "narayan", "Learn Struts", new Date(), false));
		todos.add(new TodoModel(3, "narayan", "Learn Hibernate", new Date(),
				false));}
	

	public List<TodoModel> retrieveTodos(String user) {
		List<TodoModel> filteredTodos = new ArrayList<TodoModel>();
		for (TodoModel todo : todos) {
			if (todo.getUser().equalsIgnoreCase(user)) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}

	public TodoModel retrieveTodo(int id) {
		for (TodoModel todo : todos) {
			if (todo.getId()==id) {
				return todo;
			}
		}
		return null; 
	}


    public void updateTodo(TodoModel todo){
    	System.out.println("updaye callingggg"+todo);
    		todos.remove(todo);
    		todos.add(todo);
    }

    public void addTodo(String name, String desc, Date targetDate,
            boolean isDone) {
        todos.add(new TodoModel(++todoCount, name, desc, targetDate, isDone));
    }

    public void deleteTodo(int id) {
        Iterator<TodoModel> iterator = todos.iterator();
        while (iterator.hasNext()) {
        	TodoModel todo = iterator.next();
            if (todo.getId() == id) {
                iterator.remove();
            }
        }
	}
}