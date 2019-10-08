package lab_3_client.lab_3_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class FirstNameController {

	@Value("${firstName}") String firstName;
	
	@GetMapping("/firstName")
	public String showData() {
		return "The lucky word is: " + firstName;
	}

}
