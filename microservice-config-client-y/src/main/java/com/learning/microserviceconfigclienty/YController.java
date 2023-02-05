package com.learning.microserviceconfigclienty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("microservice-y")
public class YController {

	@Value("${app.message: Default Y Message}")
	private String message;

	@GetMapping("messages")
	public String showMessage() {
		return message;
	}
}