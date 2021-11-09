package org.example.Model;

public class TodoItemTask {
    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    public TodoItemTask() {
    }

    public TodoItemTask(int id,  TodoItem todoItem, Person assignee) {
        if (id == 0) throw new RuntimeException("Id was 0 ");
        this.id = id;
        setTodoItem(todoItem);
        setAssignee(assignee);
        setAssigned();

    }

    public String getSummary(){

       if (isAssigned()){
           return assignee.getFirstName()+ " " +
                   assignee.getLastName() + " assigned " + todoItem.getTitle();
       }else {
           return todoItem.getTitle() + " are not assigned";
       }
    }

    public int getId() {
        return id;
    }



    public boolean isAssigned() {

        return assigned;
    }

    public void setAssigned() {
        if (getAssignee() != null){
            this.assigned=true;
        }
        else{
            this.assigned=false;

        }

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
