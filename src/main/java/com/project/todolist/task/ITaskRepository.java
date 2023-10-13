package com.project.todolist.task;

import com.project.todolist.user.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ITaskRepository extends JpaRepository<TaskModel, UUID> {

    List<TaskModel> findAllByIdUser(UUID idUser);




}
