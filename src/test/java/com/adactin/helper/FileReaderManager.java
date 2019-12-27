package com.adactin.helper;

public class FileReaderManager {

	private FileReaderManager() {
	}
	
	public static FileReaderManager getInstance() {

		FileReaderManager frm=new FileReaderManager();
		return frm;
	}
	
	public ConfigurationReader getConfigInstance() throws Exception {

		ConfigurationReader cfr=new ConfigurationReader();
		return cfr;
	}
}
