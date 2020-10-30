package com.javaadvent.bootrest;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TodoService {

    TodoDTO create(TodoDTO todo);
    TodoDTO delete(String id);
    List<TodoDTO> findAll();
    TodoDTO findById(String id);
    TodoDTO update(TodoDTO todo);
}
