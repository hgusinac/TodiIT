package org.example.Sequencer;

public class TodoItemTaskIdSequencer {
    private  int  currentId;

    public int nextId(){
        return currentId++;}

    public  int getCurrentId(){
        return currentId;}

    public void setCurrentId(int currentId) {
        this.currentId = currentId;
    }
}
