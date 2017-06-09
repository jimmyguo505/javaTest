package com.jimmy.Properties;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Properties集合和IO流集合使用，将map结构数据写入文件
 * 
 * @author jimmyLaboratory
 *
 */
public class PropertiesDemo1 {
	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		File file = new File("E:/tmp_JavaIO/info.properties");
		FileWriter fw = new FileWriter(file);
		
		properties.setProperty("name", "jimmy");
		properties.setProperty("age", "123456");
		properties.setProperty("hobby", "play");
		
		properties.store(fw, "TestProperties");
		
		fw.close();
		
	}
}
