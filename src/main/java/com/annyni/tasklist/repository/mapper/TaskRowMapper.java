package com.annyni.tasklist.repository.mapper;

import com.annyni.tasklist.domain.task.Status;
import com.annyni.tasklist.domain.task.Task;
import lombok.SneakyThrows;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class TaskRowMapper {

    @SneakyThrows
    public static Task mapRow(ResultSet resultSet)  {
        if (resultSet.next()) {
            Task task = new Task();
            task.setId(resultSet.getLong("task_id"));
            task.setTitle(resultSet.getString("task_title"));
            task.setDescription(resultSet.getString("task_description"));
            Timestamp timestamp = resultSet.getTimestamp("task_expiration_date");
            if (timestamp != null) {
                task.setExpirationDate(timestamp.toLocalDateTime());
            }
            task.setStatus(Status.valueOf(resultSet.getString("task_status")));

            return task;
        }

        return null;
    }

    @SneakyThrows
    public static List<Task> mapRows(ResultSet resultSet) {
        List<Task> tasks = new ArrayList<>();

        if (resultSet.next()) {
            Task task = new Task();
            task.setId(resultSet.getLong("task_id"));

            if (!resultSet.wasNull()) {
                task.setTitle(resultSet.getString("task_title"));
                task.setDescription(resultSet.getString("task_description"));
                Timestamp timestamp = resultSet.getTimestamp("task_expiration_date");
                if (timestamp != null) {
                    task.setExpirationDate(timestamp.toLocalDateTime());
                }
                task.setStatus(Status.valueOf(resultSet.getString("task_status")));

                tasks.add(task);
            }
        }

        return tasks;
    }
}
