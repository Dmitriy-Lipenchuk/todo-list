package org.example.service;

import org.example.dao.TodoListDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class TodoListService {
    private final TodoListDao todoListDao;

    @Autowired
    public TodoListService(TodoListDao todoListDao) {
        this.todoListDao = todoListDao;
    }

    public void delete(String[] notes) {
        for (String note : notes) {
            todoListDao.delete(note);
        }
    }

    public void add(String s) {
        todoListDao.add(s);
    }

    public Set<String> getList() {
        return todoListDao.getList();
    }
}
