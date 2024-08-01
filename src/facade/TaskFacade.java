package facade;

import controller.TaskController;
import view.TaskView;

public class TaskFacade {

    private TaskController controller;


    public TaskFacade() {
        this.controller = new TaskController();
    }

    public void addTask(String title) {
        controller.addTask(title);
    }

    public void markAsDone(Integer id) {
        controller.markAsDone(id);
    }

    public void allTasks() {
        controller.allTasks();
    }
}