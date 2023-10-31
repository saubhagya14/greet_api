package ed.greet.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ed.greet.service.WelcomeApiClient;

@RestController
public class GreetController {
	@Autowired
	WelcomeApiClient client;
	
	
	@GetMapping("/greet")
	public String greet() {
		 
		return "Welcome " + client.invokeWelcomeAPI();
	}
}
