package com.mailread.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyLoader {

	@Autowired
	CSVReader csvReader;
	
	
	@PostConstruct
	public void initialize() {
		
		csvReader.readEmailConfig();
	}
	
}
