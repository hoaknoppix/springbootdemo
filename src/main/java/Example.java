import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;

@RestController
@EnableAutoConfiguration
public class Example {
	
	@RequestMapping("/")
	@ResponseBody
	String hello() {
		return "This is the demo";
	}
	
	@RequestMapping("/json")
	@ResponseBody
	Person getPerson() {
		Person person = new Person();
		person.setIndex(5);
		person.setName("Hello world");
		return person;
	}
	
	
	public static void main(String args[]) {
		SpringApplication.run(Example.class, args);
	}


}
