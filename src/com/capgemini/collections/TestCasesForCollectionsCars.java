package com.capgemini.collections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class TestCasesForCollectionsCars {
	private Cars car1, car2, car3, car4, car5;

	@Before
	public void setUp() {
		car1 = new Cars("Honda", "city", 2018, 1000000);
		car2 = new Cars("Skoda", "Rapid", 2017, 11000000);
		car3 = new Cars("jaguar", "sv", 2019, 5000000);
		car4 = new Cars("Honda", "city", 2016, 800000);
		car5 = new Cars("Honda", "Amaze", 2018, 700000);
	}

	@Test
	public void testCaseOneForCars() {
		Set<Object> set = new HashSet<Object>();
		set.add(car1);
		set.add(car2);
		set.add(car3);
		set.add(car4);
		set.add(car5);
		Iterator<Object> iterator = set.iterator();
		System.out.println("Set objects");
		for (Object o : set) {

			System.out.println(o + "\n");
		}
	}

	@Test
	public void displayingValuesOfCars() {
		List<Object> list = new ArrayList<Object>();
		list.add(car1);
		list.add(car2);
		list.add(car3);
		list.add(car4);
		list.add(car5);
		Iterator<Object> iterator = list.listIterator();
		System.out.println("List objects");
		for (Object o : list) {
			System.out.println(o + "\n");
		}
	}

}
