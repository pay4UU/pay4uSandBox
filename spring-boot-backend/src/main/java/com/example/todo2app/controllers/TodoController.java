package com.example.todo2app.controllers;

import javax.validation.Valid;

import com.example.todo2app.Todo2appApplication;
import com.example.todo2app.models.Todo;
import com.example.todo2app.repositories.TodoRepository;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
//The @CrossOrigin annotation in the above controller is used to enable Cross-Origin requests. 
//This is required because we’ll be accessing the apis from angular’s frontend server.
@CrossOrigin("*")
public class TodoController {
	
	final static Logger logger = Logger.getLogger(Todo2appApplication.class);

    @Autowired
    TodoRepository todoRepository;

    @GetMapping("/todos")
    public List<Todo> getAllTodos() {
    	logger.info("TodoController :: getAllTodos ");
        Sort sortByCreatedAtDesc = new Sort(Sort.Direction.DESC, "createdAt");
        return todoRepository.findAll(sortByCreatedAtDesc);
    }

    @PostMapping("/todos")
    public Todo createTodo(@Valid @RequestBody Todo todo) {
    	logger.info("TodoController :: createTodo " + todo.toString() );
        todo.setCompleted(false);
        return todoRepository.save(todo);
    }

    @GetMapping(value="/todos/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable("id") String id) {
        Todo todo = todoRepository.findOne(id);
        
        
        if(todo == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
        	logger.info("TodoController :: getTodoById " + todo.toString() );
            return new ResponseEntity<>(todo, HttpStatus.OK);
        }
    }

    @PutMapping(value="/todos/{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable("id") String id,
                                           @Valid @RequestBody Todo todo) {
    	
    	logger.info("TodoController :: updateTodo " + todo.toString() );
        Todo todoData = todoRepository.findOne(id);
        if(todoData == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        todoData.setTitle(todo.getTitle());
        todoData.setDescription(todo.getDescription());
        todoData.setCompleted(todo.getCompleted());
        Todo updatedTodo = todoRepository.save(todoData);
        return new ResponseEntity<>(updatedTodo, HttpStatus.OK);
    }

    @DeleteMapping(value="/todos/{id}")
    public void deleteTodo(@PathVariable("id") String id) {
    	logger.info("TodoController :: deleteTodo " + id );
        todoRepository.delete(id);
    }
}