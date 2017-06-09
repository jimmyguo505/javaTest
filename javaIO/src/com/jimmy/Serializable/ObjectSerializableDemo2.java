package com.jimmy.Serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.jimmy.domain.User;

public class ObjectSerializableDemo2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/tmp_JavaIO/User1.object"));
		User user = (User)ois.readObject();
		System.out.println(user);
		ois.close();
	}
}
