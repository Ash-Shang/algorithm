package isiyi.ds.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ListTest {
	
	public static void main(String[] args) {
		
		List list=new ArrayList<>();
		new LinkedList<>();
		int size = list.size();
		System.out.println(size);
		System.out.println(12 << 2);
		Set<String> set=new HashSet<>();
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			iterator.next();
		}
	}

}
