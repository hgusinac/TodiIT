package org.example.model;

public class TodoItemTask {
    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    public TodoItemTask() {
    }

    public TodoItemTask(int id, boolean assigned, TodoItem todoItem, Person assignee) {
        if (id == 0) throw new RuntimeException("Id was 0 ");
        this.id = id;
        setAssigned(assigned);
        setTodoItem(todoItem);
        setAssignee(assignee);
    }

    public String getSummary(){

        return "\nAssigned: " + assigned + "\nTodoItem:" +todoItem +"\nPerson" + assigned;
    }

    public int getId() {
        return id;
    }



    public boolean isAssigned() {

        return assigned;
    }

    public void setAssigned(boolean assigned) {

        this.assigned=assigned;

    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }
}
