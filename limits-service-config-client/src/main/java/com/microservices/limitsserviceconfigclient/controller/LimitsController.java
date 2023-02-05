package com.microservices.limitsserviceconfigclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.limitsserviceconfigclient.beans.Limits;
import com.microservices.limitsserviceconfigclient.config.Configuration;

@RestController
@RefreshScope
public class LimitsController {

	@Autowired
	private Configuration configuration;

	@GetMapping("limits")
	public Limits retrieveLimits() {
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
	}
}
