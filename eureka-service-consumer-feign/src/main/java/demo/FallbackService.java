package demo;

import org.springframework.stereotype.Service;

@Service
public class FallbackService implements HelloService {
	public String sayHi(String name) {
		return "sorry, "+name+", service unavailable";
	}
}
