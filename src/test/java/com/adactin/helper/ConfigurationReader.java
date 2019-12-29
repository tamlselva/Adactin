package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties ps;
	
	public ConfigurationReader() throws Exception {
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\adactin\\properties\\ConfigurationProperties");
		FileInputStream fis=new FileInputStream(f);
		ps=new Properties();
		ps.load(fis);
		
	}
	
	public static String browsername() {
			String bn = ps.getProperty("browserName");
			return bn;
	}
	
	public static  String launchurl() {
			String uRl = ps.getProperty("url");
			return uRl;
	}
}
