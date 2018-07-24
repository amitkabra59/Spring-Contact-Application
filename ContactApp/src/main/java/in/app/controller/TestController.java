package in.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("/hello")
	public String helloWorld(){
		return "hello"; //view name -> WEB-INF/view/hello.jsp
	}
}
