package com.jimmy.Serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.jimmy.domain.User;

/**
 * 对象序列化
 * 
 * @author jimmyLaboratory
 *
 */
public class ObjectSerializableDemo1 {
	public static void main(String[] args) throws IOException {
		User user = new User("jimmy", 20);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:/tmp_JavaIO/User1.object"));
		oos.writeObject(user);
		oos.close();
	}
}
