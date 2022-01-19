package com.example.todo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.todo.model.Client;

public interface ClientRepo extends CrudRepository<Client, String> {




}
