package com.annyni.tasklist.service;

import com.annyni.tasklist.domain.user.User;

public interface UserService {

    User getById(Long id);

    User getUserByEmail(String username);

    User update(User user);

    User create(User user);

    boolean isTaskOwner(Long userId, Long taskId);

    void delete(Long id);
}
