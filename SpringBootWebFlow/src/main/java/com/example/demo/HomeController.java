package com.example.demo;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String getContent() throws IOException, InterruptedException, ExecutionException {
		
		PublisherExample pub=new PublisherExample();
		pub.publishMessage();
		
		return "firstview";
	}

}
