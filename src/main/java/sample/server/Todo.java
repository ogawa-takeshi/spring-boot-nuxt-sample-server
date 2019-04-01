package sample.server;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Todo {

	@Id
	private int id;

	private String text;

}
