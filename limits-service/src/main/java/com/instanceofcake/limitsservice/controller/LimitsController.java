package com.instanceofcake.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.instanceofcake.limitsservice.Configuration;
import com.instanceofcake.limitsservice.bean.Limit;

@RestController
public class LimitsController {

	@Autowired
	Configuration config;

	@GetMapping("/limits")
	public Limit retriveLimits() {
		// return new Limit(0, 1000);
		return new Limit(config.getMinimum(), config.getMaximum());
	}
}
