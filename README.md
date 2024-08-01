# Task Facade 📝

## Desenvolvedores
- [Giovana Trevizan Barbosa](https://github.com/giovanatrevizanbarbosa)
- [Natan Salvador Ligabô](https://github.com/natansalvadorligabo)

## Visão Geral
Este projeto é um exercício da matéria de DEOO (Desenvolvimento Orientado a Objetos). Sistema de gerenciamento de tarefas simples que permite adicionar, visualizar e marcar tarefas como concluídas. O sistema foi implementado utilizando o padrão de projeto Facade para simplificar a interação com um conjunto complexo de classes e métodos, proporcionando uma interface mais amigável e fácil de usar.
### Diagrama de classes
![Task](https://i.imgur.com/Nno6v83.png)

## Problema Solucionado
O padrão de projeto Facade permite realizar uma interface simples. Evita uma camada de abstração, o código de negócio pode ficar fortemente acoplado aos detalhes de implementação, resultando em dificuldades para manutenção e compreensão do sistema.

## Funcionalidade
O padrão Facade foi utilizado para fornecer uma interface simplificada para as operações de gerenciamento de tarefas. Em vez de interagir diretamente com múltiplas classes e métodos, o sistema expõe uma única classe `TaskFacade` que encapsula toda a complexidade, minimizando o esforço para atualizar para futuras versões.

## Implementação
### TaskFacade
A classe `TaskFacade` é a fachada do sistema de gerenciamento de tarefas. Ela simplifica a interface do sistema, encapsulando a complexidade das operações internas e fornecendo métodos fáceis de usar.
```java
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
```
### TaskController
A classe `TaskController` é responsável por controlar a lógica de negócio das tarefas. Ela mantém uma lista de tarefas e interage com a TaskView para exibir mensagens.
```java
public class TaskController {

    private List<Task> tasks;
    private TaskView view;

    protected TaskController() {
        this.tasks = new LinkedList<>();
        this.view = new TaskView();
    }

    protected void addTask(String title) {
        // ...
    }

    protected void markAsDone(Integer id) {
        // ...
    }

    protected void allTasks() {
        // ...
    }
}

```

### Task
A classe `Task` representa a modelagem (model) de uma tarefa. Cada tarefa possui um ID único, um título e um estado (concluída ou não).
```java
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

    // getters, setters and toString
}
```

### TaskView
A classe `TaskView` é responsável por exibir mensagens, atuando como a camada view.
```java
public class TaskView {
    public void showMessage(String message) {
        // ...
    }
}

```
