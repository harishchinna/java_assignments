package com.capgemini.collections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class TestCasesForCollectionsLaptops {
	private Laptops laptop1, laptop2, laptop3, laptop4;

	@Before
	public void setUp() {
		laptop1 = new Laptops("Lenovo", "intelI5", "Windows7", "64bit");
		laptop2 = new Laptops("Dell", "intelI5", "Windows10", "32bit");
		laptop3 = new Laptops("Macbook", "IOSi1", "IOS", "128bit");
		laptop4 = new Laptops("Lenovo", "intelI5", "Windows8", "64bit");
	}

	@Test
	public void testCaseOneForLaptops() {
		Set<Object> set = new HashSet<Object>();
		set.add(laptop1);
		set.add(laptop2);
		set.add(laptop3);
		set.add(laptop4);
		Iterator<Object> iterator = set.iterator();
		System.out.println("Set objects");
		for (Object o : set) {
			System.out.println(o + "\n");
		}
	}

	@Test
	public void displayingListOfLaptops() {
		List<Object> list = new ArrayList<Object>();
		list.add(laptop1);
		list.add(laptop2);
		list.add(laptop3);
		list.add(laptop4);
		Iterator<Object> iterator = list.listIterator();
		System.out.println("List objects");
		for (Object o : list) {
			System.out.println(o + "\n");
		}
	}

}
