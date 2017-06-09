package com.jimmy.Properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * Properties集合和IO流集合使用，将文件读入map结构数据
 * 
 * @author jimmyLaboratory
 *
 */
public class PropertiesDemo2 {
	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		FileReader fr = new FileReader(new File("E:/tmp_JavaIO/info.properties"));
		
		properties.load(fr);
		
		Set<String> stringPropertyNames = properties.stringPropertyNames();
		for (String each : stringPropertyNames) {
			System.out.println(each+"---"+properties.getProperty(each));
		}
	}
}
