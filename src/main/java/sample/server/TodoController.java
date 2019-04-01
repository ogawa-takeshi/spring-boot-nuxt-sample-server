package sample.server;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todos")
@RequiredArgsConstructor
public class TodoController {

	private final TodoRepository todoRepository;

	@GetMapping
	public Iterable<Todo> list() {
		return this.todoRepository.findAll();
	}

}
