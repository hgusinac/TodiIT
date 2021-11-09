package org.example.DAO;

import org.example.Model.TodoItem;
import org.example.Model.TodoItemTask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TodoItemTaskImpl implements TodoItemTaskDAO{
    private List<TodoItemTask> todoItemTasksStorage;

    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        boolean isSaved = this.todoItemTasksStorage.add(todoItemTask);

        if (isSaved) return todoItemTask;
        
        return null;
    }

    @Override
    public TodoItemTask findById(int id) {
        for (TodoItemTask todoItemTask : todoItemTasksStorage){
            if (todoItemTask.getId() == id){
                return todoItemTask;
            }
        }
        return null;
    }

    @Override
    public Collection<TodoItemTask> findAll() {
        return this.todoItemTasksStorage;
    }

    @Override
    public Collection<TodoItemTask> findByAssignedStatus(boolean status) {
        List<TodoItemTask> todoItemTasksList = new ArrayList<>();
        for (TodoItemTask todoItemTask : todoItemTasksList){
            if (todoItemTask.isAssigned() == status)todoItemTasksList.add(todoItemTask);
        }
        return todoItemTasksList;
    }

    @Override
    public Collection<TodoItemTask> findByPersonId(int id) {
        List<TodoItemTask> todoItemTaskList = new ArrayList<>();
        for (TodoItemTask todoItemTask : todoItemTaskList){
            if (todoItemTask.getAssignee().getId() == id ) todoItemTaskList.add(todoItemTask);
        }
        return todoItemTaskList;
    }

    @Override
    public void remove(int id) {
         this.todoItemTasksStorage.remove(findById(id));

    }
}
