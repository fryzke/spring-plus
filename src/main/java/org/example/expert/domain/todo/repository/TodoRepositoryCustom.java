package org.example.expert.domain.todo.repository;

import org.example.expert.domain.todo.entity.Todo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface TodoRepositoryCustom {
    Page<Todo> findAllByOrderByModifiedAtDesc(Pageable pageable);
    Optional<Todo> findByIdWithUser(Long todoId);
}
