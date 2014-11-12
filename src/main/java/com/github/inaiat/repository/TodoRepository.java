package com.github.inaiat.repository;

import com.github.inaiat.domain.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by inaiat.moraes on 05/11/2014.
 */
@RepositoryRestResource(collectionResourceRel = "todo", path = "todos")
public interface TodoRepository extends CrudRepository<Todo,Long> {

    Todo findTodoByTitle(@Param("title") String title);

}
