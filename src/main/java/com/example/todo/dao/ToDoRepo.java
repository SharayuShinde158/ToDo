package com.example.todo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.todo.model.ToDo;

public interface ToDoRepo extends CrudRepository<ToDo, String>{

}
