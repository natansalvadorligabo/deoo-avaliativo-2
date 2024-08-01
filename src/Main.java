import facade.TaskFacade;

public class Main {
    public static void main(String[] args) {

        TaskFacade facade = new TaskFacade();

        facade.addTask("Arrumar a cama");
        facade.addTask("Fazer as malas");

        facade.allTasks();

        facade.addTask("Realizar a atividade avaliativa 2");

        facade.markAsDone(1);
        facade.markAsDone(3);

        facade.allTasks();
    }
}