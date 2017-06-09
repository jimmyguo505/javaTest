package com.jimmy.map;

import java.util.Comparator;
import com.jimmy.domain.User3;

public class TreeMapComparator implements Comparator<User3>{

	@Override
	public int compare(User3 o1, User3 o2) {
		int temp = o1.getAge() - o2.getAge();
		return temp == 0 ? o1.getUsername().compareTo(o2.getUsername()) : temp;
	}
}
