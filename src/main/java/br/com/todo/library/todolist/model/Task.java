package br.com.todo.library.todolist.model;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String desc;
    private Boolean done;

    @ManyToMany(mappedBy = "tasks", cascade = CascadeType.ALL)
    private List<Author> authors;

    public Task() {
    }

    public Task(Long id, String title, String desc, Boolean done, List<Author> authors) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.done = done;
        this.authors = authors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
    
}
