package com.github.inaiat.test;

import com.github.inaiat.Application;
import com.github.inaiat.domain.Todo;
import com.github.inaiat.repository.TodoRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by inaiathenrique on 08/11/2014.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(classes = Application.class)
public class TodoTest {

    @Autowired
    TodoRepository todoRepository;


    @Test
    public void find() {
        Todo todo = todoRepository.findTodoByTitle("Sample 1");
        Assert.assertEquals(todo.getCompleted(), true);
    }

    @Test
    public void count() {
        Assert.assertEquals(todoRepository.count(), 2);
    }

}
