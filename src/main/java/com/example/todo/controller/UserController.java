package com.example.todo.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.ServletContext;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.todo.dao.ClientRepo;
import com.example.todo.dao.ToDoRepo;
import com.example.todo.model.Client;
import com.example.todo.model.ToDo;

@Controller
public class UserController {
	@Autowired
	ClientRepo clientrepo;
	
	@Autowired
	ToDoRepo toDoRepo;
	
	@Autowired
	ServletContext context;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("/logout")
	public String home1() {
		return "home.jsp";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam("firstName") String firstName) {
		if(clientrepo.findById(firstName) != null)
		{
			System.out.println(clientrepo.findById(firstName).toString());
			return "registrationsuccess.jsp";
		}
		else
		{
			System.out.println("*****"+clientrepo.findById(firstName).toString());
			return "login.jsp";
		}
	
	}
	@RequestMapping("/removeToDo")
	public String removeToDo(@RequestParam("firstName") String firstName,@RequestParam("Name") String Name) {
		toDoRepo.deleteById(Name);
		return "registrationsuccess.jsp";
		
	}
	@RequestMapping("/updateToDoStatus")
	public String updateToDoStatus(@RequestParam("firstName") String firstName,@RequestParam("Name") String Name,@RequestParam("Status") String Status) {
		ToDo t=(ToDo)toDoRepo.findById(Name).get();
		t.setStatus(Status);
		toDoRepo.deleteById(Name);
		toDoRepo.save(t);
		return "registrationsuccess.jsp";
		
	}
	@RequestMapping("/addClient")
	public String addClient(Client client) {
		clientrepo.save(client);
		context.setAttribute("client", client);
		return "registrationsuccess.jsp";
	}
	
	@RequestMapping("/addToDo")
	public String addToDo(ToDo todo) {
		
		toDoRepo.save(todo);
		return "registrationsuccess.jsp";
	}
}
