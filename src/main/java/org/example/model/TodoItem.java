package org.example.model;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TodoItem {
    private  int id;
    private String title;
    private String taskDescription;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    public TodoItem() {}

    public TodoItem(int id, String title, String taskDescription,LocalDate deadLine, boolean done, Person creator) {
        this.id = id;
        setTitle(title);
        setTaskDescription(taskDescription);
        setDeadLine(deadLine);
        setDone(done);
        setCreator(creator);
    }

    public String getSummary(){

        return "Id:" + id + "\nTitle: "+title+"\nDescription: "+ taskDescription+"\nDone: "+done + "\nCreator: " +creator;

    }
    /*
    public boolean isOverdue(){

        if (LocalDateTime.now() > this.deadLine){
            return true;
        }
        return false;
    }*/


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null ) throw new RuntimeException("Title was null");
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        if (deadLine == null) throw new RuntimeException("Deadline was null");
        this.deadLine = deadLine;

    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }
}
