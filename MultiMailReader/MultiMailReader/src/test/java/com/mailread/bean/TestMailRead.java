package com.mailread.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

import com.mailread.config.CSVReader;
import com.mailread.config.SpringBootWebApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={SpringBootWebApplication.class})
public class TestMailRead {
	
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	@Autowired
	CSVReader csvReader;
	
	@Test
	public void testMyFlow() {
		
		System.out.println(csvReader.getEmailConnectionLst().size());
		
	}

}
