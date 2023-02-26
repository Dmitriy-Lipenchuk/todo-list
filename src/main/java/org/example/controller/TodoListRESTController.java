package org.example.controller;

import org.example.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class TodoListRESTController {
    private final TodoListService todoListService;

    @Autowired
    public TodoListRESTController(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    @GetMapping("/todo-list")
    public Set<String> getList() {
        return todoListService.getList();
    }

    @PostMapping("/todo-list")
    public void addNote(@RequestParam String s) {
        todoListService.add(s);
    }

    @DeleteMapping("/todo-list")
    public void deleteNotes(@RequestParam String[] s) {
        todoListService.delete(s);
    }
}
