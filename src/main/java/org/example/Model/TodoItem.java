package org.example.Model;

import java.time.LocalDate;

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



    public boolean isOverdue() {

        LocalDate check = LocalDate.now();
        return (check.isAfter(deadLine) || (check.isEqual(deadLine)));
    }


    public int getId() {
        return id;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.equals("") ) throw new RuntimeException("Title was null or empty");
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
    public void setDone(boolean done){
        this.done=done;
    }


    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        if (creator ==null) throw new RuntimeException("Creator was null");
        this.creator = creator;
    }
    public String getSummary(){

        return

                "\nTitle: "+title+
                "\nDescription: "+ taskDescription+
                "\nDeadline: " + deadLine +
                "\nIsOverdue: "+ isOverdue()+
                "\nDone: "+done +
                "\nCreator: "  +creator.toString();

    }
}
