package com.costco.utils;

import java.util.Properties;

public class ReadConfig {

	Properties properties;

	public ReadConfig() {

	}

	private void loadProperties() {
		properties = new Properties();
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream("configuration.properties"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getValue(String key) {
		return properties.getProperty(key); //here key are configuration.properties key and value

	}

}
