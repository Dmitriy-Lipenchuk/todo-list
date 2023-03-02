package org.example.dao;

import org.springframework.stereotype.Component;

import java.util.LinkedHashSet;
import java.util.Set;

@Component
public class TodoListDao {
    private static final Set<String> todoList = new LinkedHashSet<>();

    public void delete(String s) {
        todoList.remove(s);
    }

    public void add(String s) {
        todoList.add(s);
    }

    public Set<String> getList() {
        return todoList;
    }
}
