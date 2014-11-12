package com.github.inaiat.app;

import com.github.inaiat.domain.Todo;
import com.github.inaiat.repository.TodoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class Application extends SpringBootServletInitializer  {

	public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class);
		setupApp(context);
    }
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

	public static void setupApp(ConfigurableApplicationContext context) {
		TodoRepository todoRepository = context.getBean(TodoRepository.class);
		todoRepository.save(new Todo("Sample 1", true));
		todoRepository.save(new Todo("Sample 2", false));

	}

}
