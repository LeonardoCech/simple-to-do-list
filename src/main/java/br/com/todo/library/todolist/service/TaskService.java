package br.com.todo.library.todolist.service;
import br.com.todo.library.todolist.model.Task;
import br.com.todo.library.todolist.repository.TaskRepository;
import java.util.List;

public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Task save(Task task) {
        return taskRepository.save(task);
    }

    public void delete(Long id) {
        taskRepository.deleteById(id);
    }

    public Task findById(Long id) {
        return taskRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Tarefa não encontrada!"));
    }   
}
