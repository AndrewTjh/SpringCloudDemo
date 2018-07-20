package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	HelloService helloService;

	@RequestMapping(value = "/sayHi")
	public String sayHi(@RequestParam String name) {
		return "from ribbon: "+helloService.hiService(name);
	}

}
