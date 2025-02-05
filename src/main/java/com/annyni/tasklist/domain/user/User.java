package com.annyni.tasklist.domain.user;

import lombok.Data;

import com.annyni.tasklist.domain.task.Task;
import javax.management.relation.Role;
import java.util.List;
import java.util.Set;

@Data
public class User {

    private Long id;
    private String name;
    private String username;
    private String password;
    private String passwordConfirmation;
    private Set<Role> roles;
    private List<Task> tasks;

}
