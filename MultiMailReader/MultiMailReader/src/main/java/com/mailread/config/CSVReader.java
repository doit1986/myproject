package com.mailread.config;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.mailread.bean.EmailConnection;

import net.sf.jsefa.Deserializer;
import net.sf.jsefa.csv.CsvIOFactory;


@Service("csvReader")
public class CSVReader {
	
	private List<EmailConnection> emmailConList=new ArrayList<EmailConnection>();
	
	
	
	/*public static void main(String[] args) {
		
		CSVReader read=new CSVReader();
		read.readEmailConfig();
	}*/


	public void readEmailConfig() {


		Deserializer deserializer = CsvIOFactory.createFactory(EmailConnection.class).createDeserializer();

		StringReader reader = new StringReader(getFile("props/email.csv"));
		deserializer.open(reader);
		while (deserializer.hasNext()) {
			EmailConnection emailConnection = deserializer.next();
			emmailConList.add(emailConnection);
		}
		deserializer.close(true);


	}

	private String getFile(String fileName) {

		StringBuilder result = new StringBuilder("");

		//Get file from resources folder
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());

		try (Scanner scanner = new Scanner(file)) {

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				result.append(line).append("\n");
			}

			scanner.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return result.toString();

	}
	
	public List<EmailConnection> getEmailConnectionLst() {
		
		return emmailConList;
		
		
	}

}



