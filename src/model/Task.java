package model;

public class Task {

    private static Integer nextId = 1;
    private Integer id;
    private String title;
    private Boolean isDone;

    public Task(String title) {
        this.id = nextId++;
        this.title = title;
        this.isDone = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isDone=" + (isDone ? "Complete" : "Incomplete") +
                '}';
    }
}