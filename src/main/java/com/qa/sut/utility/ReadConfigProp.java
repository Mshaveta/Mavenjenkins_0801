package com.qa.sut.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigProp {
	static FileInputStream fis;
	public static String readProp(String prop_name)  {
		//Step1: Get Prop File path 
		String propFilePath = System.getProperty("user.dir")+"\\config\\config.properties";
		
		try {
			fis = new FileInputStream(propFilePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String propVal = prop.getProperty(prop_name);
		return propVal;
	}
	 
}
