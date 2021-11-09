package org.example.DAO;

import org.example.Model.TodoItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TodoItemImpl implements TodoItemDAO {

    private List<TodoItem> todoItemList = new ArrayList<>();

    @Override
    public TodoItem persist(TodoItem todoItem) {
        boolean isSaved = this.todoItemList.add(todoItem);
        if (isSaved){
            return todoItem;
        }
        return null;
    }

    @Override
    public TodoItem findById(int id) {
       for (TodoItem todoItem :this.todoItemList){
           if (todoItem.getId() == id){
               return todoItem;
           }
       }
       return null;
    }

    @Override
    public Collection<TodoItem> findAll() {
        return this.todoItemList;
    }

    @Override
    public Collection<TodoItem> findAllByDoneStatus(boolean done) {
        List<TodoItem> todoIteDoneList = new ArrayList<>();
        for (TodoItem todoItem : this.todoItemList){
            if (todoItem.isDone()){
                todoIteDoneList.add(todoItem);
            }
        }
        return null;
    }

    @Override
    public Collection<TodoItem> findByTitleContains(String title) {
        List<TodoItem> todoItemTitle= new ArrayList<>();
        for (TodoItem todoItem: todoItemList){
            if (todoItem.getTitle().contains(title)){
               todoItemTitle.add(todoItem);
            }
        }
        return null;
    }

    @Override
    public Collection<TodoItem> findByPersonId(int personId) {
        List<TodoItem> todoItemPersonId = new ArrayList<>();

        for (TodoItem todoItem:todoItemList){
            if (todoItem.getCreator().getId() == personId) todoItemList.add(todoItem);
        }
        return todoItemPersonId;
    }

    @Override
    public Collection<TodoItem> findByDeadlineBefore(LocalDate date) {
        List<TodoItem> todoItemBefore = new ArrayList<>();
        for (TodoItem todoItem :todoItemList){
            if (todoItem.getDeadLine().isBefore(date)) todoItemBefore.add(todoItem);
        }
        return todoItemBefore;
    }

    @Override
    public Collection<TodoItem> findByDeadlineAfter(LocalDate date) {
       List<TodoItem> todoItemAfter = new ArrayList<>();
       for (TodoItem todoItem : todoItemList){
           if (todoItem.getDeadLine().isAfter(date)) todoItemAfter.add(todoItem);
       }
       return null;
    }

    @Override
    public void remove(int id) {

        this.todoItemList.remove(findById(id));

    }
}
