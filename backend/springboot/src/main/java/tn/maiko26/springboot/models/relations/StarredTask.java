package tn.maiko26.springboot.models.relations;

import jakarta.persistence.*;
import tn.maiko26.springboot.models.Task;
import tn.maiko26.springboot.models.User;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "starred_items")
@IdClass(StarredTaskId.class)
public class StarredTask {
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "email")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    @Column(name = "created_at", nullable = false, columnDefinition = "timestamp default now()")
    private Date createdAt;
}

class StarredTaskId implements Serializable {
    private String user;
    private String task;
}