package br.com.todo.library.todolist.repository;

import br.com.todo.library.todolist.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
