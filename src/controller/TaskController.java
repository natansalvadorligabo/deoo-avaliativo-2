package controller;

import model.Task;
import view.TaskView;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class TaskController {

    private List<Task> tasks;
    private TaskView view;

    public TaskController() {
        this.tasks = new LinkedList<>();
        this.view = new TaskView();
    }

    public void addTask(String title) {
        if (title == null) {
            view.showMessage("Task title cannot be empty.");
            return;
        }
        Task newTask = new Task(title);

        tasks.add(newTask);

        view.showMessage("Task added successfully: " + newTask.toString());
    }

    public void markAsDone(Integer id) {
        boolean found = false;
        for(Task task: tasks) {
            if(Objects.equals(task.getId(), id)) {
                task.setDone(true);
                view.showMessage("Task " + id + " mask as done successfully");
                found = true;
                break;
            }
        }
        if(!found) {
            view.showMessage("Task with id " + id + " not found");
        }
    }

    public void allTasks() {
        if (tasks.isEmpty()) {
            view.showMessage("No tasks available");
        } else {
            for (Task task : tasks) {
                view.showMessage(task.toString());
            }
        }
    }
}