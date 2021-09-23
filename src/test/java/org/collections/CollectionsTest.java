package org.collections;

import java.util.*;
//import java.util.List;

import org.testng.annotations.Test;

public class CollectionsTest {
	
	@Test
	private void collectionsPractice() {
		
		List<Integer> li = new LinkedList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(2, 40);
		System.out.println(li.lastIndexOf(30));
		
		System.out.println(li);
	}

}
