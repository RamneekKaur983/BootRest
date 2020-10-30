package com.javaadvent.bootrest;

import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;
@org.springframework.stereotype.Repository
public interface TodoRepository  extends Repository<Todo , String> {
    void delete(Todo deleted);
    List<Todo> findAll();
    Optional<Todo> findOne(String id);
    Todo save(Todo saved);
}
