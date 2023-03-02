package org.example.controller;

import org.example.service.TodoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class TodoListRestController {
    private final TodoListService todoListService;

    @Autowired
    public TodoListRestController(TodoListService todoListService) {
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

    @DeleteMapping("/todo-list-notes")
    public void deleteNotes(@RequestParam String[] s) {
        todoListService.delete(s);
    }
}
