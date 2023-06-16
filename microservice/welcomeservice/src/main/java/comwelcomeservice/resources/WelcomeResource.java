package comwelcomeservice.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/welcome")

public class WelcomeResource {
	@GetMapping
	public String name() {
		return "Welcommee";
	}
	
	
	

}
