package com.comp584.task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.HashMap;

@RestController
@CrossOrigin(origins = "*")
public class TaskController {

	@GetMapping("/")
	public HashMap<String, String> index() {
		HashMap<String, String> map = new HashMap<>();
		map.put("data", "Greetings From Spring");
		return map;
	}

}