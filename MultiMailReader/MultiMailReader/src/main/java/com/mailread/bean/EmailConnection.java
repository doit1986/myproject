package com.mailread.bean;

import net.sf.jsefa.csv.annotation.CsvDataType;
import net.sf.jsefa.csv.annotation.CsvField;

@CsvDataType
public class EmailConnection {

	@CsvField(pos = 1)
	private String entity;

	@CsvField(pos = 2)
	private String hostName;

	@CsvField(pos = 3)
	private String portName;

	@CsvField(pos = 4)
	private String protocol;

	@CsvField(pos = 5)
	private String userName;

	@CsvField(pos = 6)
	private String password;





}
