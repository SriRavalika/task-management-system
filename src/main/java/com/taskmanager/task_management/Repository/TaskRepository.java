package com.taskmanager.task_management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskmanager.task_management.Entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}