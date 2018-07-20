package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	@Autowired
	HelloService helloService;
	
	@RequestMapping("/sayHi")
	public String sayHi(String name) {
		return "from feign: "+helloService.sayHi(name);
	}
}
